package com.dil.cafecloud.model.order;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int orderId;

    String name;
    int customerId;
    int drinkId;
    double price;
    LocalDateTime orderDate;

}
