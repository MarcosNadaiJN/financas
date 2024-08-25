package com.example.financas.repository;

import com.example.financas.domain.movimentacao.financeira.ContaAPagar;
import com.example.financas.generic.CrudJPARepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContaAPagarRepository extends CrudJPARepository<ContaAPagar, UUID> {
}
