package com.myproject.daraz_backend.Services;

import com.myproject.daraz_backend.Entities.OTP;
import com.myproject.daraz_backend.Repository.OTPRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OTPService {
    @Autowired
    private EmailService emailService;
    @Autowired
    private OTPRepo repository;
    private static  final Logger logger = LoggerFactory.getLogger(OTPService.class);

    private OTP getOTP(){
        OTP otp = new OTP();
        LocalDateTime expirationTime = LocalDateTime.now().plusMinutes(5);
        otp.generateOTP(5);
        otp.setExpirationTime(expirationTime);
        return otp;
    }

    public void sendOTP(String email){
        String otp = getOTP().getOtp();
        String body = "Your Verification Code: " + getOTP();
        logger.info("OTPService 22: Sending OTP Email: " + email);
        emailService.sendEmail(email,"Email Verification For Daraz",body);
        saveOTP(getOTP());
    }

    public Boolean VerifyOTP(String otp,String email){
        OTP otpEntity = getOTPFromDB(email);
        if(otpEntity.getOtp() == otp){
            logger.info("OTPService 22: {} is Verified ", email);
            return true;
        }
        logger.info("OTPService 22: {} is not Verified ", email);
        return false;
    }

    private void saveOTP(OTP otp){
        repository.save(otp);
        logger.info("OTPService 23: Saved OTP for email: " + otp.getEmail());
    }

    private OTP getOTPFromDB(String email){
        OTP otp = repository.findByEmailAndExpirationTimeIsAfter(email,LocalDateTime.now().minusMinutes(5));
        logger.info("OTPService 23: Retrieved OTP for email :{} " ,email);
        return otp;
    }

}
