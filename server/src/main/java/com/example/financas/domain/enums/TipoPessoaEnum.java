package com.example.financas.domain.enums;

public enum TipoPessoaEnum {

    PESSOA_FISICA("Pessoa Física", "PF"),
    PESSOA_JURIDICA("Pessoa Juridica", "PJ");

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
