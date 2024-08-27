package com.example.financas.repository;

import com.example.financas.domain.produto.Produto;
import com.example.financas.generic.CrudJPARepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProdutoRepository extends CrudJPARepository<Produto, UUID> {
}
