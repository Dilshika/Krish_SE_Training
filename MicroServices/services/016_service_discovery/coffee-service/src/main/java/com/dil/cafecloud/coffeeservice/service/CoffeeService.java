package com.dil.cafecloud.coffeeservice.service;

import com.dil.cafecloud.model.coffee.Coffee;

import java.util.List;

public interface CoffeeService{
    Coffee save(Coffee coffee);

    Coffee findById(int id);

    List<Coffee> findAll();
}
