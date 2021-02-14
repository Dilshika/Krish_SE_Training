package com.dil.cafecloud.commons.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "prices")
@Data
public class CoffeePrice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int cid;
    String size;
    int price;


}
