package com.myproject.daraz_backend.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class Buyer implements User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String role;

//    public Buyer(Long user_id, String name, String password, String email, String phone, String address, String role) {
//        this.user_id = user_id;
//        this.name = name;
//        this.password = password;
//        this.email = email;
//        this.phone = phone;
//        this.address = address;
//        this.role = role;
//    }



    @Override
    public void logIn() {

    }

    @Override
    public void logOut() {

    }

    @Override
    public void signUp() {

    }
}
