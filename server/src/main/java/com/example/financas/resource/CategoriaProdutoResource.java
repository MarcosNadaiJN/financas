package com.example.financas.resource;

import com.example.financas.domain.produto.CategoriaProduto;
import com.example.financas.service.CategoriaProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria-produto")
public class CategoriaProdutoResource {

    private final CategoriaProdutoService categoriaProdutoService;

    public CategoriaProdutoResource(CategoriaProdutoService categoriaProdutoService) {
        this.categoriaProdutoService = categoriaProdutoService;
    }

    @PostMapping
    public ResponseEntity<CategoriaProduto> save(@RequestBody CategoriaProduto categoriaProduto) {
        return ResponseEntity.ok(this.categoriaProdutoService.save(categoriaProduto));
    }
}