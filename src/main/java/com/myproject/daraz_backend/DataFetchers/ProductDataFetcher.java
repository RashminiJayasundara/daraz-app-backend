package com.myproject.daraz_backend.DataFetchers;

import com.myproject.daraz_backend.Entities.Product;
import com.myproject.daraz_backend.Services.ProductService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@DgsComponent
public class ProductDataFetcher {
    private static  final Logger logger = LoggerFactory.getLogger(ProductDataFetcher.class);
    @Autowired
    private ProductService productService;
    public ProductDataFetcher() {}

    @DgsQuery
    public <List>Product GetProductsForMoveToLove(@InputArgument int id){
        return null;
    }

    @DgsMutation
    public Long AddProduct(@InputArgument Product item){
        logger.info("ProductDataFetcher 27: Adding product");
        return productService.addProduct(item);
    }
}
