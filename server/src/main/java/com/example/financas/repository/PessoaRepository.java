package com.example.financas.repository;

import com.example.financas.domain.pessoa.Pessoa;
import com.example.financas.generic.CrudJPARepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PessoaRepository extends CrudJPARepository<Pessoa, UUID> {
}
