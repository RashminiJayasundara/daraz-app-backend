package com.myproject.daraz_backend.Repository;

import com.myproject.daraz_backend.Entities.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepo extends JpaRepository<OrderItems,Long> {

}
