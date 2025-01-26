package com.myproject.daraz_backend.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long review_id;
    @ManyToOne
    private Buyer buyer;
    @ManyToOne
    private Product product;
    private String review_text;
    private String review_date;
    private int rating;
}
