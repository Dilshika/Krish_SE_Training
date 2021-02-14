package com.dil.cafecloud.model.customer;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerId;

    //Name
    private String firstName;
    private String lastName;
    //Address
    private String houseNo;
    private String street;
    private String city;
    private String zipcode;

    @OneToMany(mappedBy = "customer")
    private List<Loyality> loyalityList;



}
