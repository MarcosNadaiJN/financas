package com.example.financas.domain.movimentacao.patrimonial;

import com.example.financas.domain.enums.FormaDePagamentoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class MovimentacaoPatrimonial implements Serializable {


    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID id;

    @NotNull
    private BigDecimal valorTotal = BigDecimal.ZERO;

    @NotNull
    @Column(name = "formadepagamento")
    private FormaDePagamentoEnum formaDePagamento;

    @NotNull
    private Long numeroParcelas;

    private String descricao;
}
