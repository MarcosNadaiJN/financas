package com.example.financas.resource;

import com.example.financas.domain.movimentacao.financeira.ContaAPagar;
import com.example.financas.service.ContasAPagarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contas-a-pagar")
public class ContasAPagarResource {

    private final ContasAPagarService service;

    public ContasAPagarResource(ContasAPagarService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ContaAPagar> save(@RequestBody ContaAPagar contaAPagar) {
        return ResponseEntity.ok(this.service.save(contaAPagar));
    }
}
