package com.myproject.daraz_backend.Repository;

import com.myproject.daraz_backend.Entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Long> {
}
