package com.dil.cafecloud.orderservice.controller;

import com.dil.cafecloud.model.coffee.Coffee;
import com.dil.cafecloud.model.order.Order;
import com.dil.cafecloud.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

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
    public Order getOrder(@PathVariable int id)
    {
        System.out.println("request came on "+ LocalDateTime.now() + "********");
        return orderService.findById(id);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.findAll();
    }

}