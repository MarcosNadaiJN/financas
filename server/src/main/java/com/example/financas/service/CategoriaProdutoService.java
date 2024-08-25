package com.example.financas.service;

import com.example.financas.domain.dto.CategoriaProdutoDTO;
import com.example.financas.domain.produto.CategoriaProduto;
import com.example.financas.generic.CrudJPAService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CategoriaProdutoService extends CrudJPAService<CategoriaProduto, UUID, CategoriaProdutoDTO> {
}
