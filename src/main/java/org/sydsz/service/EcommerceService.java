package org.sydsz.service;

import org.sydsz.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sydsz.repository.EcommerceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EcommerceService {

    @Autowired
    private EcommerceRepository ecommerceRepository;

    public List<Product> getAllProducts() {
        return ecommerceRepository.findAll();
    }

    public Optional<Product> getProductById(String id) {
        return ecommerceRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return ecommerceRepository.save(product);
    }

    public void deleteProduct(String id) {
        ecommerceRepository.deleteById(id);
    }
}
