package com.myproject.daraz_backend.Repository;

import com.myproject.daraz_backend.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepo extends JpaRepository<Order, Integer> {
}
