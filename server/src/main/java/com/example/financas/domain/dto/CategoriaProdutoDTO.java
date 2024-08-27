package com.example.financas.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CategoriaProdutoDTO {

    private UUID id;
    private Long codigo;
    private String descricao;
}
