package com.jdev.microservices.product_microservice.category;

import java.util.List;

import com.jdev.microservices.product_microservice.product.ProductResponse;

/**
 * CategoryResponse
 */
public record CategoryResponse(
    Integer id,
    String name,
    String description,
    List<ProductResponse> products
) {

}
