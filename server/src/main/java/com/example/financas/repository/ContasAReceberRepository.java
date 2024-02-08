package com.example.financas.repository;

import com.example.financas.domain.movimentacao.financeira.ContasAReceber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContasAReceberRepository extends JpaRepository<ContasAReceber, UUID> {
}
