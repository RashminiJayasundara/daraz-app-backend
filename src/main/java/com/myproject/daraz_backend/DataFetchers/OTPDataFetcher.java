package com.myproject.daraz_backend.DataFetchers;

import com.myproject.daraz_backend.Services.OTPService;
import com.myproject.daraz_backend.codegen.types.VerifyOTP;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@DgsComponent
public class OTPDataFetcher {
    @Autowired
    private OTPService otpService;
    private static  final Logger logger = LoggerFactory.getLogger(OTPDataFetcher.class);

    @DgsQuery
    public Boolean SendOTP(@InputArgument String email){
        logger.info("OTPDataFetcher 19: Request to send email to : {}",email);
        otpService.sendOTP(email);
        return true;
    }
    @DgsQuery
    public Boolean VerifyOTP(@InputArgument VerifyOTP verifyOTP){
        logger.info("OTPDataFetcher 26: Request to verify otp : {}",verifyOTP.getOtp());
       return otpService.VerifyOTP(verifyOTP.getOtp(),verifyOTP.getEmail());
    }
}
