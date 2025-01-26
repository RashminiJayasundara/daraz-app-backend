package com.myproject.daraz_backend.Repository;

import com.myproject.daraz_backend.Entities.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BuyerRepo extends JpaRepository<Buyer, Long> {

 Buyer findByEmail(String email);
}
