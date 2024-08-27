package com.example.financas.repository;

import com.example.financas.domain.movimentacao.patrimonial.Venda;
import com.example.financas.generic.CrudJPARepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VendaRepository extends CrudJPARepository<Venda, UUID> {
}
