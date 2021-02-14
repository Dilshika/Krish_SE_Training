package com.dil.cafecloud.model.coffee;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "coffee")
@Data
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int drinkId;

    String name;
    String size;
    double price;



}
