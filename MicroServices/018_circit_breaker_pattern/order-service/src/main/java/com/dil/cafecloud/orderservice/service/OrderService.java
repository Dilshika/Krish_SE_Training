package com.dil.cafecloud.orderservice.service;

import com.dil.cafecloud.model.order.Order;
import com.dil.cafecloud.orderservice.model.DetailReport;


import java.util.List;
import java.util.concurrent.ExecutionException;

public interface OrderService {
    Order save(Order order);
    Order findById(int id);

    List<Order> findAll();

    DetailReport findDetailReport(int id) throws ExecutionException, InterruptedException;
}
