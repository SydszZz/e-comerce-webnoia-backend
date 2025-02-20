package org.sydsz.service;

import org.sydsz.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sydsz.repository.EcommerceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EcommerceService {

    @Autowired
    private EcommerceRepository ecommerceRepository;

    public List<Produto> getAllProdutos() {

        return ecommerceRepository.findAll();
    }

    public Optional<Produto> getProdutosById(String id) {
        Optional<Produto> produtoOptional = ecommerceRepository.findById(id);
        return Optional.ofNullable(produtoOptional.orElse(null)); // Retorna null se não encontrar
    }

    public Produto createProduto(Produto produto) {
        return ecommerceRepository.save(produto);
    }

    public void deleteProduto(String id) {
        ecommerceRepository.deleteById(id);
    }
}
