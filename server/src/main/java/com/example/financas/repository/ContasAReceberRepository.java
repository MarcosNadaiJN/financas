package com.example.financas.repository;

import com.example.financas.domain.movimentacao.financeira.ContaAReceber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContasAReceberRepository extends JpaRepository<ContaAReceber, UUID> {
}
