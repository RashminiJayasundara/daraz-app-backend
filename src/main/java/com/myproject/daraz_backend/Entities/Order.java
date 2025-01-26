package com.myproject.daraz_backend.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long orderId;
  @ManyToOne
  private Buyer buyer;
  private String status;
  private String orderDate;
  private double totalPrice;
}
