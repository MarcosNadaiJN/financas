package com.example.financas.resource;


import com.example.financas.domain.produto.ProdutoCompra;
import com.example.financas.service.ProdutoCompraService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/produto-compra")
public class ProdutoCompraResource {

    private final ProdutoCompraService produtoCompraService;

    public ProdutoCompraResource(ProdutoCompraService produtoCompraService) {
        this.produtoCompraService = produtoCompraService;
    }

    @GetMapping("/{id}")
    public ProdutoCompra findById(@PathVariable UUID id) {
        return produtoCompraService.findById(id);
    }

    @PostMapping
    public ProdutoCompra save(@RequestBody ProdutoCompra produtoCompra) {
        return produtoCompraService.save(produtoCompra);
    }

    @PutMapping("/{id}")
    public ProdutoCompra update(@PathVariable UUID id, @RequestBody ProdutoCompra produtoCompra) {
        return produtoCompraService.update(id, produtoCompra);
    }

    @DeleteMapping("/{id}")
    public void deleteById (@PathVariable UUID id) {
        this.produtoCompraService.delete(id);
    }
}
