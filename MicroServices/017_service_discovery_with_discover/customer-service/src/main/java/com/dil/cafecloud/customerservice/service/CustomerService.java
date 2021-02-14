package com.dil.cafecloud.customerservice.service;

import com.dil.cafecloud.model.customer.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();


}
