package com.example.financas.domain.movimentacao.patrimonial;

import com.example.financas.domain.dto.CompraDTO;
import com.example.financas.domain.enums.FormaDePagamentoEnum;
import com.example.financas.domain.enums.converters.FormaDePagamentoEnumConverter;
import com.example.financas.domain.enums.converters.TipoPessoaEnumConverter;
import com.example.financas.domain.movimentacao.financeira.ContaAPagar;
import com.example.financas.domain.pessoa.Pessoa;
import com.example.financas.domain.produto.ProdutoCompra;
import com.example.financas.generic.CrudEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "compra")
public class Compra implements CrudEntity<UUID, CompraDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    @Column(name = "valor_total")
    private BigDecimal valorTotal = BigDecimal.ZERO;

    @NotNull
    @Column(name = "forma_de_pagamento")
    @Convert(converter = FormaDePagamentoEnumConverter.class)
    private FormaDePagamentoEnum formaDePagamento;

    @NotNull
    @Column(name = "numero_parcelas")
    private Long numeroParcelas;

    private String descricao;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fornecedor_id")
    private Pessoa fornecedor;

    @OneToMany(mappedBy = "compra", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ContaAPagar> contasAPagar;

    @OneToMany(mappedBy = "compra", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ProdutoCompra> produtos;

    @Override
    public CompraDTO toDTO() {

        CompraDTO dto = new CompraDTO();

        dto.setId(this.id);
        dto.setValorTotal(this.valorTotal);
        dto.setFormaDePagamento(this.formaDePagamento);
        dto.setNumeroParcelas(this.numeroParcelas);
        dto.setDescricao(this.descricao);
        dto.setFornecedor(this.fornecedor.toDTO());
        return dto;
    }
}
