package com.myproject.daraz_backend.DataFetchers;

import com.myproject.daraz_backend.Entities.Seller;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.InputArgument;

@DgsComponent
public class SellerDataFetcher {
    @DgsMutation
    public Integer AddSeller(@InputArgument Seller seller) {
        return 0;
    }
}
