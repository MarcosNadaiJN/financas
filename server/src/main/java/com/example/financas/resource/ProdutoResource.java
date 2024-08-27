package com.example.financas.resource;

import com.example.financas.domain.dto.ProdutoDTO;
import com.example.financas.domain.produto.Produto;
import com.example.financas.generic.CrudJPAResource;
import com.example.financas.service.ProdutoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource extends CrudJPAResource<Produto, UUID, ProdutoDTO> {
    public ProdutoResource(ProdutoService service) {
        super(service);
    }
}
