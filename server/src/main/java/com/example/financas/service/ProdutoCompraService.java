package com.example.financas.service;

import com.example.financas.domain.produto.ProdutoCompra;
import com.example.financas.repository.ProdutoCompraRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProdutoCompraService {

    private static ProdutoCompraRepository produtoCompraRepository;

    public ProdutoCompra findById(UUID id) {
        return produtoCompraRepository.getReferenceById(id);
    }

    public ProdutoCompra save(ProdutoCompra produtoCompra) {
        return produtoCompraRepository.saveAndFlush(produtoCompra);
    }

    public ProdutoCompra update(UUID id, ProdutoCompra produtoCompra) {
        if (!produtoCompraRepository.existsById(id)) {
            throw new RuntimeException("Produto Compra não encontrado!");
        }
        return produtoCompraRepository.saveAndFlush(produtoCompra);
    }

    public void delete(UUID id) {
        produtoCompraRepository.deleteById(id);
    }
}
