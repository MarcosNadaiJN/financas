package com.example.financas.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class ContaAPagarDTO {

    private UUID id;
    private BigDecimal valorInicial;
    private BigDecimal valorPago;
    private BigDecimal jurosPago;
    private LocalDate dataVencimento;
    private LocalDateTime dataPagamento;
    private String descricao;
    private UUID fornecedorId;
    private UUID compraId;
}
