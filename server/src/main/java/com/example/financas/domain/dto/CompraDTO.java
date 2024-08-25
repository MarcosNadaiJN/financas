package com.example.financas.domain.dto;

import com.example.financas.domain.enums.FormaDePagamentoEnum;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class CompraDTO {

    private UUID id;
    private BigDecimal valorTotal = BigDecimal.ZERO;
    private FormaDePagamentoEnum formaDePagamento;
    private Long numeroParcelas;
    private String descricao;
    private PessoaDTO fornecedor;
}
