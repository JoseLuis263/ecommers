package com.jdev.microservices.customer_microservice.customer;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * CustomerRepository
 */

public interface CustomerRepository extends MongoRepository <Customer, String> {

}
