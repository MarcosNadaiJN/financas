package com.example.financas.repository;

import com.example.financas.domain.movimentacao.patrimonial.Compra;
import com.example.financas.generic.CrudJPARepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CompraRepository extends CrudJPARepository<Compra, UUID> {
}
