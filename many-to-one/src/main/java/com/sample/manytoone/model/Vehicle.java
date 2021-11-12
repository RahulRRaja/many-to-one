package com.sample.manytoone.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "Vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "Vehicle_id")
    private List<User_info> User = new ArrayList<>();

    public Vehicle() {
    }

    public Vehicle(String name, List<User_info> user) {
        this.name = name;
        User = user;
    }

    public String getName() {
        return name;
    }

    public List<User_info> getUser() {
        return User;
    }
}
