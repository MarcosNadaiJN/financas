package com.example.financas.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class ContaAReceberDTO {

    private UUID id;
    private BigDecimal valorInicial = BigDecimal.ZERO;
    private BigDecimal valorPago = BigDecimal.ZERO;
    private BigDecimal jurosPago = BigDecimal.ZERO;
    private LocalDateTime dataVencimento;
    private LocalDateTime dataPagamento;
    private String descricao;
}
