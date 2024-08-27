package com.example.financas.service;

import com.example.financas.domain.dto.ProdutoDTO;
import com.example.financas.domain.produto.Produto;
import com.example.financas.generic.CrudJPAService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProdutoService extends CrudJPAService<Produto, UUID, ProdutoDTO> {
}
