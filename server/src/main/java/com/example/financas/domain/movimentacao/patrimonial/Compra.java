package com.example.financas.domain.movimentacao.patrimonial;

import com.example.financas.domain.movimentacao.financeira.ContasAPagar;
import com.example.financas.domain.pessoa.Fornecedor;
import com.example.financas.domain.produto.Produto;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "compra")
public class Compra extends MovimentacaoPatrimonial implements Serializable {

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;

    @OneToMany(mappedBy = "compra")
    private List<ContasAPagar> contasAPagar;

    @OneToMany(mappedBy = "compra")
    private List<Produto> produtos;
}
