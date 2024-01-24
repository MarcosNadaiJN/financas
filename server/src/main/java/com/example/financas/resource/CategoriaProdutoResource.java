package com.example.financas.resource;

import com.example.financas.domain.produto.CategoriaProduto;
import com.example.financas.service.CategoriaProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaProdutoResource {

    private final CategoriaProdutoService categoriaProdutoService;

    public CategoriaProdutoResource(CategoriaProdutoService categoriaProdutoService) {
        this.categoriaProdutoService = categoriaProdutoService;
    }

    @PostMapping
    public ResponseEntity<CategoriaProduto> save(@RequestParam(value = "descricao", required = true) String descricao) {
     return ResponseEntity.ok(this.categoriaProdutoService.save(descricao));
    }
}
