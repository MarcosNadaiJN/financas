package com.example.financas.repository;

import com.example.financas.domain.movimentacao.financeira.ContaAPagar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContasAPagarRepository extends JpaRepository<ContaAPagar, UUID> {
}
