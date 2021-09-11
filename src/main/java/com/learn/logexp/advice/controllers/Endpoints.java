package com.learn.logexp.advice.controllers;

import com.learn.logexp.advice.exception.InvalidProductException;
import com.learn.logexp.advice.model.Product;
import com.learn.logexp.advice.service.CustomiseProduct;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunil
 * @project log-exception-controller-advice-app
 * @created 2021/09/10 5:22 PM
 */
@RestController
@Slf4j
public class Endpoints {

    @Autowired
    CustomiseProduct customiseProduct;

    @Operation(summary = "Get Product information by skuid")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Product found",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Product.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid Product",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Product not found",
                    content = @Content) })
    @GetMapping(value = "/product/{skuid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Product getProductDetails(@PathVariable("skuid") String skuid)
    {
        Product product = null;
        if ((StringUtils.isNotBlank(skuid))  && Integer.valueOf(skuid) > 100){
            product = customiseProduct.getProductInfo(skuid);
        }
        else {
            throw new InvalidProductException("Invalid product " + skuid);
        }

        log.info("Product informations :: " + product);
        return product;
    }
}
