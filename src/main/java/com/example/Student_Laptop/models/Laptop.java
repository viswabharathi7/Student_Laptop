package com.example.Student_Laptop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {
    @Id
    private int laptop_id;
    private String laptopName;



}
