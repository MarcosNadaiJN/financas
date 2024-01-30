package com.example.financas.service;

import com.example.financas.domain.produto.CategoriaProduto;
import com.example.financas.repository.CategoriaProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaProdutoService {

    private CategoriaProdutoRepository categoriaProdutoRepository;

    public CategoriaProdutoService(CategoriaProdutoRepository categoriaProdutoRepository) {
        this.categoriaProdutoRepository = categoriaProdutoRepository;
    }

    public CategoriaProduto save(CategoriaProduto categoriaProduto) {
        return this.categoriaProdutoRepository.save(categoriaProduto);
    }
}
