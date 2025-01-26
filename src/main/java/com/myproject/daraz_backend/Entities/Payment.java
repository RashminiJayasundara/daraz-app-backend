package com.myproject.daraz_backend.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;
    @OneToOne
    private Order order;
    private String paymentType;
    private String paymentDate;
    private String paymentAmount;
   private String status;
}
