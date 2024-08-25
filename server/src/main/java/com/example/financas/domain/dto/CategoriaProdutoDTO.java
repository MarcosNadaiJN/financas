package com.example.financas.domain.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class CategoriaProdutoDTO {

    private UUID id;
    private Long codigo;
    private String descricao;
}
