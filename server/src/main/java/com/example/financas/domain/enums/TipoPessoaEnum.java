package com.example.financas.domain.enums;

import com.example.financas.generic.enums.CodedEnum;

public enum TipoPessoaEnum implements CodedEnum {

    FISICA("Pessoa Física", "PF"),
    JURIDICA("Pessoa Juridica", "PJ");

    private final String descricao;
    private final String codigo;

    TipoPessoaEnum(String descricao, String codigo) {
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
