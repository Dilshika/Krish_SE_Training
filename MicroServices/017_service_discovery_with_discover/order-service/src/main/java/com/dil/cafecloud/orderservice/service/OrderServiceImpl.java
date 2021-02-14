package com.dil.cafecloud.orderservice.service;

import com.dil.cafecloud.model.coffee.Coffee;
import com.dil.cafecloud.model.customer.Customer;
import com.dil.cafecloud.model.order.Order;
import com.dil.cafecloud.orderservice.model.DetailReport;
import com.dil.cafecloud.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

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
        Optional<Order> order= orderRepository.findById(id);
        if (order.isPresent()) {
            return order.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public DetailReport findDetailReport(int id) {
        Order order = findById(id);
        Customer customer=getCustomer(order.getCustomerId());
        Coffee coffee=getDrink(order.getDrinkId());

        return new DetailReport(order,customer,coffee);

    }


    private Customer getCustomer(int customerId) {

        Customer customer = restTemplate.getForObject("http://customer/services/customers/" + customerId, Customer.class);
        return customer;

    }

    private Coffee getDrink(int drinkId) {

        return restTemplate.getForObject("http://coffee/services/coffees/" + drinkId, Coffee.class);


    }
}