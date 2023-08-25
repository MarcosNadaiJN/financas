package com.example.financas.domain.movimentacao.financeira;

import com.example.financas.domain.pessoa.Pessoa;
import com.example.financas.domain.movimentacao.patrimonial.Compra;
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
@Table(name = "contasapagar")
public class ContasAPagar extends MovimentacaoFinanceira implements Serializable {

    @NotNull
    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Pessoa fornecedor;

    @ManyToOne
    @JoinColumn(name = "compraorigem_id")
    private Compra compraOrigem;
}
