package com.myproject.daraz_backend.Repository;

import com.myproject.daraz_backend.Entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepo extends JpaRepository<Seller, Integer> {
}
