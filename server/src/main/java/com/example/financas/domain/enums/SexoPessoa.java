package com.example.financas.domain.enums;

public enum SexoPessoa {

    MASCULINO("Masculino", "M"),
    FEMININO("Feminino", "F");

    private final String descricao;
    private final String codigo;

    SexoPessoa(String descricao, String codigo) {
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
