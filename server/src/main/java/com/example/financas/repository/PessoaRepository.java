package com.example.financas.repository;

import com.example.financas.domain.pessoa.Pessoa;
import com.example.financas.generic.CrudJPARepository;

import java.util.UUID;

public interface PessoaRepository extends CrudJPARepository<Pessoa, UUID> {
}
