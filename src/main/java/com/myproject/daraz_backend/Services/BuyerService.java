package com.myproject.daraz_backend.Services;

import com.myproject.daraz_backend.Entities.Buyer;
import com.myproject.daraz_backend.Repository.BuyerRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerService {
    @Autowired
    public BuyerRepo repository;
    private static  final Logger logger = LoggerFactory.getLogger(BuyerService.class);
    public boolean CheckUserIsRegister(String email) {
        Buyer buyer =repository.findByEmail(email);
        if (buyer == null) {
            logger.info("Buyer with email " + email + " not found");
            return false;
        }
        logger.info("Buyer with email " + email + " is registered");
        return true;
    }
}
