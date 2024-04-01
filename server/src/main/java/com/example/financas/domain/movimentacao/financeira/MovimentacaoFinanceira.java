package com.example.financas.domain.movimentacao.financeira;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class MovimentacaoFinanceira implements Serializable {

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

//    @Formula("")
//    private Long diasDeAtrasoPagamento;

//    @Formula("")
//    private Boolean estaPaga;

    private String descricao;
}
