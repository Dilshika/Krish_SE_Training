package com.dil.cafecloud.configconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class CustomerProfileConfiguration {

    @Autowired
    Environment environment;

    public String getCustomerType(){
        return environment.getProperty("customer.type");
    }

    public String getDiscountPrice(){
        return environment.getProperty("price.discount");
    }
}
