package com.example.financas.service;

import com.example.financas.domain.movimentacao.financeira.ContaAPagar;
import com.example.financas.repository.ContasAPagarRepository;
import org.springframework.stereotype.Service;

@Service
public class ContasAPagarService {

    private ContasAPagarRepository repository;

    public ContasAPagarService(ContasAPagarRepository repository) {
        this.repository = repository;
    }

    public ContaAPagar save(ContaAPagar contaAPagar) {
        return this.repository.save(contaAPagar);
    }
}
