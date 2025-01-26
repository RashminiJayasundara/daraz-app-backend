package com.myproject.daraz_backend.Repository;

import com.myproject.daraz_backend.Entities.OTP;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface OTPRepo extends JpaRepository<OTP, Integer> {
    OTP findByEmailAndExpirationTimeIsAfter(String email, LocalDateTime expirationTime);
}
