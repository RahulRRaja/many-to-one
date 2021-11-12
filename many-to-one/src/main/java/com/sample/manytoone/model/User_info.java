package com.sample.manytoone.model;

import javax.persistence.*;
@Entity
@Table(name = "User")
public class User_info {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid")
    private Long user_id;
    @Column(name = "username")
    private String user_name;

    public User_info() {
    }

    public User_info(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_name() {
        return user_name;
    }
}
