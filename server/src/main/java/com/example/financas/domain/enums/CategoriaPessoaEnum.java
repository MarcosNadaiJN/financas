package com.example.financas.domain.enums;

import com.example.financas.generic.enums.CodedEnum;

public enum CategoriaPessoaEnum implements CodedEnum {

    BANCO("Banco", "BC"),
    FUNCIONARIO("Funcionário", "FU"),
    FORNECEDOR("Fornecedor", "FO"),
    CLIENTE("Cliente", "CL");

    private final String descricao;
    private final String codigo;

    CategoriaPessoaEnum(String descricao, String codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodigo() {
        return codigo;
    }
}
