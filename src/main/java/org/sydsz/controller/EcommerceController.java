package org.sydsz.controller;

import org.sydsz.model.Product;
import org.sydsz.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class EcommerceController {

    @Autowired
    private EcommerceService ecommerceService;

    @GetMapping
    public List<Product> getAllProducts() {
        return ecommerceService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable String id) {
        return ecommerceService.getProductById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return ecommerceService.createProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id) {
        ecommerceService.deleteProduct(id);
    }
}

