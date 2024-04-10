package com.example.financas;

import com.example.financas.domain.enums.FormaDePagamentoEnum;
import com.example.financas.domain.enums.TipoPessoaEnum;
import com.example.financas.domain.movimentacao.financeira.ContaAPagar;
import com.example.financas.domain.movimentacao.financeira.ContaAReceber;
import com.example.financas.domain.movimentacao.patrimonial.Compra;
import com.example.financas.domain.movimentacao.patrimonial.Venda;
import com.example.financas.domain.pessoa.Cliente;
import com.example.financas.domain.pessoa.Fornecedor;
import com.example.financas.repository.ClienteRepository;
import com.example.financas.repository.CompraRepository;
import com.example.financas.repository.ContasAPagarRepository;
import com.example.financas.repository.ContasAReceberRepository;
import com.example.financas.repository.FornecedorRepository;
import com.example.financas.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class FinancasApplication  {
    public static void main(String[] args) {
        SpringApplication.run(FinancasApplication.class, args);
    }
}
