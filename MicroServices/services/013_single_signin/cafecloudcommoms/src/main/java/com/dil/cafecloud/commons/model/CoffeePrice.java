package com.dil.cafecloud.commons.model;

import javax.persistence.*;

@Entity
@Table(name = "prices")
public class CoffeePrice {

    @Id
    @GeneratedValue
    //@Column(name = "cid")
    int cid;

    String size;
    int price;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   // @ManyToOne
    //@JoinColumn(name = "cid")
   // private Coffee coffee;
}
