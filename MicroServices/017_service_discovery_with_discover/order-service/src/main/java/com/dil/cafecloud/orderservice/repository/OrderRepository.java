package com.dil.cafecloud.orderservice.repository;

import com.dil.cafecloud.model.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
