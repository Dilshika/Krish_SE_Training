package com.dil.cafecloud.orderservice.model;

import com.dil.cafecloud.model.order.Order;

public class SimpleReport implements Report{

    Order order;

    public SimpleReport(Order order){
        this.order=order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
