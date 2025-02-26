package com.example.financas.repository;

import com.example.financas.domain.produto.ProdutoCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProdutoCompraRepository extends JpaRepository<ProdutoCompra, UUID> {
}
