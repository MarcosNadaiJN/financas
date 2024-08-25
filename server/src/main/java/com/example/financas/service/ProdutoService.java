package com.example.financas.service;

import com.example.financas.domain.dto.ProdutoDTO;
import com.example.financas.domain.produto.Produto;
import com.example.financas.generic.CrudJPAService;

import java.util.UUID;

public class ProdutoService extends CrudJPAService<Produto, UUID, ProdutoDTO> {
}
