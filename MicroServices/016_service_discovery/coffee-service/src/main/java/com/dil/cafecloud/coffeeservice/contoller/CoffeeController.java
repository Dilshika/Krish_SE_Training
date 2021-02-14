package com.dil.cafecloud.coffeeservice.contoller;

import com.dil.cafecloud.coffeeservice.service.CoffeeService;
import com.dil.cafecloud.model.coffee.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/services/coffees")
public class CoffeeController {

    @Autowired
    CoffeeService coffeeService;

    @PostMapping
    public Coffee save(@RequestBody Coffee coffee) {
        return coffeeService.save(coffee);
    }

    @GetMapping(value = "/{id}")
    public Coffee getDrink(@PathVariable int id)
    {
        System.out.println("request came on "+ LocalDateTime.now() + "********");
        return coffeeService.findById(id);
    }

    @GetMapping
    public List<Coffee> getAllVehicles() {
        return coffeeService.findAll();
    }

}

