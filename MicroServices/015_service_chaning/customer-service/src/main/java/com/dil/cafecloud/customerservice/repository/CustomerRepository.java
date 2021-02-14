package com.dil.cafecloud.customerservice.repository;

import com.dil.cafecloud.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
