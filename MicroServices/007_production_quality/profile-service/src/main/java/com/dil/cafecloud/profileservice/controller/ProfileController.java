package com.dil.cafecloud.profileservice.controller;

import com.dil.cafecloud.commons.model.Customer;
import com.dil.cafecloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/profile",method = RequestMethod.POST)
    public Customer save(@RequestBody  Customer customer){

        return customerService.save(customer);

    }

    @RequestMapping(value = "/profile/{id}", method = RequestMethod.GET)
    public Customer fetchById(@PathVariable("id") int profileId) {

       return customerService.fetchById(profileId);

    }

    @RequestMapping(value = "/profiles", method = RequestMethod.GET)
    public List<Customer> fetchAllProfiles() {
        return customerService.fetchAllProfiles();
    }

}
