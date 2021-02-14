package com.dil.cafecloud.orderservice.controller;

import com.dil.cafecloud.model.coffee.Coffee;
import com.dil.cafecloud.model.order.Order;
import com.dil.cafecloud.orderservice.model.Report;
import com.dil.cafecloud.orderservice.model.SimpleReport;
import com.dil.cafecloud.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.Response;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping(value = "/services/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping
    public Order save(@RequestBody Order order) {
        return orderService.save(order);
    }

    @GetMapping(value = "/{id}")
    public Report getRent(@PathVariable int id, @RequestParam(required = false) String type) throws ExecutionException, InterruptedException {

        if(type==null){
            return  new SimpleReport(orderService.findById(id));
        }else{
            return    orderService.findDetailReport(id);
        }

    }


    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.findAll();
    }

}