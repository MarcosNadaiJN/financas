package com.example.financas.repository;

import com.example.financas.domain.movimentacao.patrimonial.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompraRepository extends JpaRepository<Compra, UUID> {
}
