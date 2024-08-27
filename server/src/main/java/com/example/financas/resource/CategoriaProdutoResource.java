package com.example.financas.resource;

import com.example.financas.domain.dto.CategoriaProdutoDTO;
import com.example.financas.domain.produto.CategoriaProduto;
import com.example.financas.generic.CrudJPAResource;
import com.example.financas.service.CategoriaProdutoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/categorias-produtos")
public class CategoriaProdutoResource extends CrudJPAResource<CategoriaProduto, UUID, CategoriaProdutoDTO> {
    public CategoriaProdutoResource(CategoriaProdutoService service) {
        super(service);
    }
}