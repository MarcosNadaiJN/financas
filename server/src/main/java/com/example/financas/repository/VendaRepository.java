package com.example.financas.repository;

import com.example.financas.domain.movimentacao.patrimonial.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VendaRepository extends JpaRepository<Venda, UUID> {
}
