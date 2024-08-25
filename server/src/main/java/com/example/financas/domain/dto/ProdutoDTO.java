package com.example.financas.domain.dto;

import com.example.financas.domain.produto.CategoriaProduto;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class ProdutoDTO {

    private UUID id;
    private String descricao;
    private CategoriaProduto categoria;
    private String modelo;
    private BigDecimal precoCompra = BigDecimal.ZERO;
    private BigDecimal precoVenda = BigDecimal.ZERO;
    private BigDecimal margemLucro;
}
