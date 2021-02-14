package com.dil.cafeteria.service;

import com.dil.cafeteria.model.Coffee;
import com.dil.cafeteria.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CoffeeServiceImpl implements CoffeeService{

    @Autowired
    CoffeeRepository coffeeRepository;

    public Coffee save(Coffee coffee){

        return  coffeeRepository.save(coffee);
    }

    public Coffee fetchCoffeeById(int id){

        Optional <Coffee> coffee=coffeeRepository.findById(id);
        if(coffee.isPresent()){
            return  coffee.get();
        }
        return null;
    }

}
