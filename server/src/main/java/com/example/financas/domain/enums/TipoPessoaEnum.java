package com.example.financas.domain.enums;

public enum TipoPessoaEnum {

    FISICA("Pessoa Física", "PF"),
    PURIDICA("Pessoa Juridica", "PJ");

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
