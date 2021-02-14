package com.dil.cafeteria.controller;

import com.dil.cafeteria.model.Coffee;
import com.dil.cafeteria.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    CoffeeService coffeeService;

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String greeting(){
        return "Hello from get method";
    }

    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public String greet(){
        return "Hello from post method";
    }

    @RequestMapping(value = "/coffee",method = RequestMethod.POST)
    public Coffee save(@RequestBody Coffee coffee){
        return  coffeeService.save(coffee);
    }

    @RequestMapping(value = "/coffee",method = RequestMethod.GET)
    public ResponseEntity<Coffee> fetchCoffeeById(@RequestParam int id){

        Coffee coffee=coffeeService.fetchCoffeeById(id);
        if(coffee==null){
            return  ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok().body(coffee);
        }
    }


}
