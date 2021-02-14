package com.dil.cafecloud.customerservice.service;

import com.dil.cafecloud.customerservice.repository.CustomerRepository;
import com.dil.cafecloud.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        Optional<Customer> customer=customerRepository.findById(id);
        if(customer.isPresent()){
            return customer.get();
        }else {
            return null;
        }
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
