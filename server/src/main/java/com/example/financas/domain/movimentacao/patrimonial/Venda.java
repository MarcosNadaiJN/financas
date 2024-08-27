package com.example.financas.domain.movimentacao.patrimonial;

import com.example.financas.domain.dto.VendaDTO;
import com.example.financas.domain.enums.FormaDePagamentoEnum;
import com.example.financas.domain.movimentacao.financeira.ContaAReceber;
import com.example.financas.domain.pessoa.Pessoa;
import com.example.financas.domain.produto.Produto;
import com.example.financas.domain.produto.ProdutoVenda;
import com.example.financas.generic.CrudEntity;
import jakarta.persistence.Column;
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
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
@Setter
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "venda")
public class Venda implements CrudEntity<UUID, VendaDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    @Column(name = "valor_total")
    private BigDecimal valorTotal = BigDecimal.ZERO;

    @NotNull
    @Column(name = "forma_de_pagamento")
    private FormaDePagamentoEnum formaDePagamento;

    @NotNull
    @Column(name = "numero_parcelas")
    private Long numeroParcelas;

    private String descricao;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Pessoa cliente;

    @OneToMany(mappedBy = "venda", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ContaAReceber> contasAReceber;

    @OneToMany(mappedBy = "venda", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ProdutoVenda> produtos;

    @Override
    public VendaDTO toDTO() {

        VendaDTO dto = new VendaDTO();

        dto.setId(this.id);
        dto.setValorTotal(this.valorTotal);
        dto.setFormaDePagamento(this.formaDePagamento);
        dto.setNumeroParcelas(this.numeroParcelas);
        dto.setDescricao(this.descricao);
        return dto;
    }

}
