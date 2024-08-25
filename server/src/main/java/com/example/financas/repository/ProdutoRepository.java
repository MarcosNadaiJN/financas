package com.example.financas.repository;

import com.example.financas.domain.produto.Produto;
import com.example.financas.generic.CrudJPARepository;

import java.util.UUID;

public interface ProdutoRepository extends CrudJPARepository<Produto, UUID> {
}
