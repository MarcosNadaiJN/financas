package com.example.financas.domain.dto;

import com.example.financas.domain.enums.TipoContaBancariaEnum;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class ContaBancariaDTO {

    private UUID id;
    private TipoContaBancariaEnum tipo;
    private String numeroConta;
    private String agencia;
    private BigDecimal saldo = BigDecimal.ZERO;
}
