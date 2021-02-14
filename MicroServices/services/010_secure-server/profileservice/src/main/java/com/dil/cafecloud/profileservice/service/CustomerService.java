package com.dil.cafecloud.profileservice.service;

import com.dil.cafecloud.commons.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);
    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
