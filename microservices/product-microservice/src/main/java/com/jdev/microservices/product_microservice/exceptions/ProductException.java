package com.jdev.microservices.product_microservice.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode 
@Data 
public class ProductException extends RuntimeException{
    private final String message;
}
