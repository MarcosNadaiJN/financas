package com.example.financas.repository;

import com.example.financas.domain.movimentacao.patrimonial.Venda;
import com.example.financas.generic.CrudJPARepository;

import java.util.UUID;

public interface VendaRepository extends CrudJPARepository<Venda, UUID> {
}
