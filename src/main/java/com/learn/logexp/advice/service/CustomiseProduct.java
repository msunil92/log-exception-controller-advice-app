package com.learn.logexp.advice.service;

import com.learn.logexp.advice.model.Product;
import org.springframework.stereotype.Service;

/**
 * @author sunil
 * @project log-exception-controller-advice-app
 * @created 2021/09/10 5:23 PM
 */
@Service
public class CustomiseProduct {

    public Product getProductInfo(String skuid){
        Product product = Product.builder().id(skuid).name("phone").desc("Iphone version 10").build();
        return product;
    }
}
