package com.dil.cafeteria.repository;

import com.dil.cafeteria.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee,Integer> {

}
