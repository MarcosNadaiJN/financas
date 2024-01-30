package com.example.financas.repository;

import com.example.financas.domain.produto.CategoriaProduto;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CategoriaProdutoRepository extends CrudRepository<CategoriaProduto, UUID> {
}
