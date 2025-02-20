package org.sydsz.controller;

import org.sydsz.model.Produto;
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
    public List<Produto> getAllProdutos() {
        return ecommerceService.getAllProdutos();
    }

    @GetMapping("/{id}")
    public Optional<Produto> getProdutosById(@PathVariable String id) {
        return ecommerceService.getProdutosById(id);
    }

    @PostMapping
    public Produto createProduto(@RequestBody Produto product) {
        return ecommerceService.createProduto(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id) {
        ecommerceService.deleteProduto(id);
    }
}

