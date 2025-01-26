package com.myproject.daraz_backend.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    private int count;
    private String category;
    private String image;
    private int reviewsCount;
    private int soldCount;
    @ManyToOne
    private Seller seller;

}
