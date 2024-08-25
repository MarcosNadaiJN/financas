package com.example.financas.domain.movimentacao.financeira;

import com.example.financas.domain.dto.ContaAPagarDTO;
import com.example.financas.generic.CrudEntity;
import com.example.financas.domain.movimentacao.patrimonial.Compra;
import com.example.financas.domain.pessoa.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "conta_a_pagar")
public class ContaAPagar implements CrudEntity<UUID, ContaAPagarDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    private BigDecimal valorInicial = BigDecimal.ZERO;

    private BigDecimal valorPago = BigDecimal.ZERO;

    private BigDecimal jurosPago = BigDecimal.ZERO;

    @NotNull
    private LocalDate dataVencimento;

    private LocalDateTime dataPagamento;

    private String descricao;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fornecedor_id")
    private Pessoa fornecedor;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "compra_origem_id")
    private Compra compra;

    @Override
    public ContaAPagarDTO toDTO() {

        ContaAPagarDTO dto = new ContaAPagarDTO();

        dto.setId(this.id);
        dto.setValorInicial(this.valorInicial);
        dto.setValorPago(this.valorPago);
        dto.setJurosPago(this.jurosPago);
        dto.setDataVencimento(this.dataVencimento);
        dto.setDataPagamento(this.dataPagamento);
        dto.setDescricao(this.descricao);
        return dto;
    }
}
