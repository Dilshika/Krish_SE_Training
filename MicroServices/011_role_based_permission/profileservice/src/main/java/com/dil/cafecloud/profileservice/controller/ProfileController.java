package com.dil.cafecloud.profileservice.controller;

import com.dil.cafecloud.commons.model.Customer;
import com.dil.cafecloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

@Autowired
    CustomerService customerService;




@RequestMapping(value = "/profile",method = RequestMethod.POST)
@PreAuthorize("hasAuthority('create_profile')")
public Customer save(Customer customer){
    return customerService.save(customer);
}

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public Customer fetch(@RequestParam int profileId) {
        return customerService.fetchById(profileId);
    }

    @RequestMapping(value = "/profiles", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_admin')")
    public List<Customer> fetch() {
        return customerService.fetchAllProfiles();
    }

}
