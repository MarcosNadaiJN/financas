package com.example.financas.domain.movimentacao.financeira;

import com.example.financas.domain.movimentacao.patrimonial.Venda;
import com.example.financas.domain.pessoa.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
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
public class ContaAReceber implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
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
}
