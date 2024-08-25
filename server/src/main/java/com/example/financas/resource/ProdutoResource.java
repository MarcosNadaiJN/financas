package com.example.financas.resource;

import com.example.financas.domain.dto.ProdutoDTO;
import com.example.financas.domain.produto.Produto;
import com.example.financas.generic.CrudJPAResource;
import com.example.financas.service.ProdutoService;

import java.util.UUID;

public class ProdutoResource extends CrudJPAResource<Produto, UUID, ProdutoDTO> {
    public ProdutoResource(ProdutoService service) {
        super(service);
    }
}
