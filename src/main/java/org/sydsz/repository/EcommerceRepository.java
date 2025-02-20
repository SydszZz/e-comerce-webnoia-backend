package org.sydsz.repository;

import org.sydsz.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EcommerceRepository extends MongoRepository<Produto, String> {
}
