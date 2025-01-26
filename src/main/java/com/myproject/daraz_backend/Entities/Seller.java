package com.myproject.daraz_backend.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seller implements User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String storeName;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String role;

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
