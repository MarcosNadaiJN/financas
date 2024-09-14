package com.example.financas.domain.enums;

import com.example.financas.generic.enums.CodedEnum;

public enum SexoPessoaEnum  implements CodedEnum {

    INEXISTENTE("Inexistente", "I"),
    MASCULINO("Masculino", "M"),
    FEMININO("Feminino", "F");

    private final String descricao;
    private final String codigo;

    SexoPessoaEnum(String descricao, String codigo) {
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
