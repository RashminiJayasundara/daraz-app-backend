package com.myproject.daraz_backend.Repository;

import com.myproject.daraz_backend.Entities.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Reviews,Long> {
}
