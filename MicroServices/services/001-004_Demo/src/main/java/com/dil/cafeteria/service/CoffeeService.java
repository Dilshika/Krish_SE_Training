package com.dil.cafeteria.service;

import com.dil.cafeteria.model.Coffee;


public interface CoffeeService {

    Coffee save(Coffee coffee);
    public Coffee fetchCoffeeById(int id);


}
