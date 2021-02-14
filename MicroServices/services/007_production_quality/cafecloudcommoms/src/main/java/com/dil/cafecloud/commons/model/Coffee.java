package com.dil.cafecloud.commons.model;

;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "coffees")
@Data
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int cid;
    String name;


}
