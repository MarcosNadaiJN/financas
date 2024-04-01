package com.example.financas.domain.movimentacao.patrimonial;

import com.example.financas.domain.movimentacao.financeira.ContaAReceber;
import com.example.financas.domain.pessoa.Cliente;
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
@Table(name = "venda")
public class Venda extends MovimentacaoPatrimonial implements Serializable {

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "venda")
    private List<ContaAReceber> contasAReceber;

    @OneToMany(mappedBy = "venda")
    private List<Produto> produtos;
}
