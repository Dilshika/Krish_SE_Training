package com.dil.cafecloud.orderservice.service;

import com.dil.cafecloud.model.coffee.Coffee;
import com.dil.cafecloud.model.customer.Customer;
import com.dil.cafecloud.model.order.Order;
import com.dil.cafecloud.orderservice.hystrix.CoffeeCommand;
import com.dil.cafecloud.orderservice.hystrix.CommonHystrixCommand;
import com.dil.cafecloud.orderservice.model.DetailReport;
import com.dil.cafecloud.orderservice.repository.OrderRepository;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    HystrixCommand.Setter setter;

    @LoadBalanced
    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }


    @Override
    public Order findById(int id) {
        Optional<Order> order = orderRepository.findById(id);
        if (order.isPresent()) {
            return order.get();
        } else {
            return new Order();
        }
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
   // @HystrixCommand(fallbackMethod = "findDetailReportFallback")
    public DetailReport findDetailReport(int id) throws ExecutionException, InterruptedException {

        //only works circuit breaker annotation if this is the first method being calling
        //if inner class this want work
        //Customer customer=restTemplate.getForObject("http://customer/services/customers/" + id, Customer.class);

        Order order = findById(id);
        Customer customer=getCustomer(order.getCustomerId());
        Coffee coffee=getDrink(order.getDrinkId());
        return new DetailReport(order,customer,coffee);

    }

    public DetailReport findDetailReportFallback(int id){
        return new DetailReport(new Order(),new Customer(),new Coffee());
    }

    private Customer getCustomer(int customerId) throws ExecutionException, InterruptedException {

        CommonHystrixCommand<Customer> customerCommonHystrixCommand=new CommonHystrixCommand<Customer>("default",()->{
            return restTemplate.getForObject("http://customer/services/customers/" + customerId, Customer.class);
        }, ()->{
            return new Customer();
        }
        );

        Future<Customer> customerFuture=customerCommonHystrixCommand.queue();
        return customerFuture.get();
    }

    private Coffee getDrink(int drinkId) {

        CoffeeCommand coffeeCommand=new CoffeeCommand(restTemplate,drinkId);
        return coffeeCommand.execute();


    }
}