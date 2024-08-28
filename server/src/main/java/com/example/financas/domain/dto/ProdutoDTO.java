package com.example.financas.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ProdutoDTO {

    private UUID id;
    private String marca;
    private String modelo;
    private String descricao;
}
