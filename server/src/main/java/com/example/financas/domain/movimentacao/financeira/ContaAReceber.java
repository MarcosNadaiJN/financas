package com.example.financas.domain.movimentacao.financeira;

import com.example.financas.domain.dto.ContaAReceberDTO;
import com.example.financas.domain.movimentacao.patrimonial.Venda;
import com.example.financas.domain.pessoa.Pessoa;
import com.example.financas.generic.CrudEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "conta_a_receber")
public class ContaAReceber implements CrudEntity<UUID, ContaAReceberDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    private BigDecimal valorInicial = BigDecimal.ZERO;

    private BigDecimal valorPago = BigDecimal.ZERO;

    private BigDecimal jurosPago = BigDecimal.ZERO;

    @NotNull
    private LocalDateTime dataVencimento;

    private LocalDateTime dataPagamento;

    private String descricao;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Pessoa cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "venda_origem_id")
    private Venda venda;

    @Override
    public ContaAReceberDTO toDTO() {

        ContaAReceberDTO dto = new ContaAReceberDTO();
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
