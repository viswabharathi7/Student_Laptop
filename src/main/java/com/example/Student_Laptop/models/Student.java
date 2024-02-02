package com.example.Student_Laptop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Student {
    @Id
    private int Student_ID;
    private String Name;


}
