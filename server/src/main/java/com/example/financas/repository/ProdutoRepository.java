package com.example.financas.repository;

import com.example.financas.domain.produto.Produto;
import com.example.financas.generic.CrudJPARepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProdutoRepository extends CrudJPARepository<Produto, UUID> {

    List<Produto> findAllByCategoriaId(UUID categoriaId);
}
