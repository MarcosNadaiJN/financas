package com.example.financas;

import com.example.financas.domain.TipoPessoaEnum;
import com.example.financas.domain.movimentacao.financeira.ContasAPagar;
import com.example.financas.domain.pessoa.Fornecedor;
import com.example.financas.domain.pessoa.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinancasApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinancasApplication.class, args);
    }

}
