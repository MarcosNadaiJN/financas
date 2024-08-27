package com.example.financas.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class ProdutoVendaDTO {

    private UUID id;
    private UUID produtoid;
    private UUID vendaId;
    private BigDecimal precoVenda = BigDecimal.ZERO;
    private BigDecimal quantidade = BigDecimal.ZERO;
}
