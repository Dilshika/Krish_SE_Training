package com.dil.cafecloud.customerservice.controller;


import com.dil.cafecloud.customerservice.service.CustomerService;
import com.dil.cafecloud.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/services/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping(value = "/id")
    public Customer getCustomer(@PathVariable int id){
        System.out.println("request come on"+ LocalDateTime.now()+"*****");
        return customerService.findById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers(){
        return  customerService.findAll();
    }

}
