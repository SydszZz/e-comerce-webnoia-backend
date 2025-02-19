package org.sydsz.repository;

import org.sydsz.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EcommerceRepository extends MongoRepository<Product, String> {
}
