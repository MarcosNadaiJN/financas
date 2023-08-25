package com.example.financas.domain.movimentacao.financeira;

import com.example.financas.domain.pessoa.Pessoa;
import com.example.financas.domain.movimentacao.patrimonial.Venda;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "contasareceber")
public class ContasAReceber extends MovimentacaoFinanceira implements Serializable {

    @NotNull
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Pessoa cliente;

    @ManyToOne
    @JoinColumn(name = "vendaorigem_id")
    private Venda vendaOrigem;
}
