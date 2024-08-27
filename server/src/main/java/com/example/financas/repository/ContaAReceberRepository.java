package com.example.financas.repository;

import com.example.financas.domain.movimentacao.financeira.ContaAReceber;
import com.example.financas.generic.CrudJPARepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContaAReceberRepository extends CrudJPARepository<ContaAReceber, UUID> {
}
