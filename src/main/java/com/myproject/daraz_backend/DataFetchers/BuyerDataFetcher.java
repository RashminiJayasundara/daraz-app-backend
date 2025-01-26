package com.myproject.daraz_backend.DataFetchers;

import com.myproject.daraz_backend.Services.BuyerService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@DgsComponent
public class BuyerDataFetcher {
    @Autowired
    public BuyerService buyerService;
    private static  final Logger logger = LoggerFactory.getLogger(BuyerDataFetcher.class);
    @DgsQuery
    public boolean CheckUserIsRegister(@InputArgument String email) {
        logger.info("Checking if user is registered");
        return buyerService.CheckUserIsRegister(email);
    }
}
