package com.dil.cafecloud.coffeeservice.repository;

import com.dil.cafecloud.model.coffee.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository  extends JpaRepository<Coffee,Integer> {
}
