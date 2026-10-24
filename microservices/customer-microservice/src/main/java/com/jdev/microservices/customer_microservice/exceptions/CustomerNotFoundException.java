package com.jdev.microservices.customer_microservice.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * CustomerNotFoundException
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerNotFoundException extends RuntimeException {
    private final String message;
}
