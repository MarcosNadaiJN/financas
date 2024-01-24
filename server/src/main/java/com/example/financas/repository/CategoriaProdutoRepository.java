package com.example.financas.repository;

import com.example.financas.domain.produto.CategoriaProduto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoriaProdutoRepository extends JpaRepository<CategoriaProduto, UUID> {
}
