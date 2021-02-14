package com.dil.cafecloud.coffeeservice.service;

import com.dil.cafecloud.coffeeservice.repository.CoffeeRepository;
import com.dil.cafecloud.model.coffee.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoffeeServiceImpl implements CoffeeService{

    @Autowired
    CoffeeRepository coffeeRepository;

    @Override
    public Coffee save(Coffee coffee) {
        return coffeeRepository.save(coffee);
    }

    @Override
    public Coffee findById(int id) {
        Optional<Coffee> coffee=coffeeRepository.findById(id);
        if(coffee.isPresent()){
            return coffee.get();
        }else {
            return null;
        }
    }

    @Override
    public List<Coffee> findAll() {
        return coffeeRepository.findAll();
    }
}
