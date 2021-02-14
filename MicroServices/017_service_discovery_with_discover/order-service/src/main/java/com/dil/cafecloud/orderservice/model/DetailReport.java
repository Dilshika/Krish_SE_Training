package com.dil.cafecloud.orderservice.model;

import com.dil.cafecloud.model.coffee.Coffee;
import com.dil.cafecloud.model.customer.Customer;
import com.dil.cafecloud.model.order.Order;

public class DetailReport implements Report{
    Order order;
    Customer customer;
    Coffee coffee;

    public DetailReport(Order order,Customer customer,Coffee coffee){
        this.coffee=coffee;
        this.customer=customer;
        this.order=order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
}
