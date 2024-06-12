package com.example.financas.service;

import com.example.financas.domain.pessoa.Pessoa;
import com.example.financas.domain.produto.CategoriaProduto;
import com.example.financas.repository.CategoriaProdutoRepository;
import com.example.financas.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa save(Pessoa pessoa) {
        return this.pessoaRepository.save(pessoa);
    }

    public Pessoa findById(UUID id) {
        return this.pessoaRepository.findById(id).get();
    }
}
