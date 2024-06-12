package com.example.financas.resource;

import com.example.financas.domain.pessoa.Pessoa;
import com.example.financas.domain.produto.CategoriaProduto;
import com.example.financas.service.CategoriaProdutoService;
import com.example.financas.service.PessoaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/pessoa")
public class PessoaResource {

    private final PessoaService pessoaService;

    public PessoaResource(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public ResponseEntity<Pessoa> save(@RequestBody Pessoa pessoa) {
        return ResponseEntity.ok(this.pessoaService.save(pessoa));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> findById(@PathVariable(name = "id")UUID id) {
        return ResponseEntity.ok(this.pessoaService.findById(id));
    }
}