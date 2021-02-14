package com.dil.cafecloud.commons.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "coffee")
public class Coffee {

    @Id
     @GeneratedValue
     //@Column(name = "cid")
    int cid;

    String name;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   // @OneToMany(mappedBy = "coffee")
    //private Set<CoffeePrice> coffeePrices=new HashSet<CoffeePrice>();
}
