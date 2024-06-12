package com.example.financas.repository;

import com.example.financas.domain.pessoa.Pessoa;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PessoaRepository extends CrudRepository<Pessoa, UUID> {
}
