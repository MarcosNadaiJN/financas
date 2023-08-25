package com.example.financas.domain.movimentacao.financeira;

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

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class MovimentacaoFinanceira implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_sequence_movfinan")
    @SequenceGenerator(name = "gen_sequence_movfinan", sequenceName = "sequence_movfinan")
    private UUID id;

    @NotNull
    private BigDecimal valorInicial = BigDecimal.ZERO;

    private BigDecimal valorPago = BigDecimal.ZERO;

    private BigDecimal jurosPago = BigDecimal.ZERO;

    @NotNull
    private LocalDateTime dataVencimento;

    private LocalDateTime dataPagamento;

    private Long diasDeAtrasoPagamento;

    private Boolean estaPaga;

    private String descricao;

    @PreUpdate
    public void preUpdate() {
        if (this.dataPagamento != null) {
            this.setEstaPaga(Boolean.TRUE);
        }
    }
}
