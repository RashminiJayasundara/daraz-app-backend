package com.myproject.daraz_backend.Services;

import com.myproject.daraz_backend.Entities.Product;
import com.myproject.daraz_backend.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repository;
    private static  final Logger logger = LoggerFactory.getLogger(ProductService.class);

    public List<Product> getAllProducts() {
        List<Product> products = repository.findAll();
        logger.info("ProductService 20 : getAllProducts called");
        return products;
    }
    public Long addProduct(Product product) {
        Product p=repository.save(product);
        logger.info("ProductService 24 : addProduct product name: " + "dxfcg");
        return null;
    }

}
