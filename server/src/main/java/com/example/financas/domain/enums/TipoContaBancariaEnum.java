package com.example.financas.domain.enums;

public enum TipoContaBancariaEnum {

    CONTA_POUPANCA("Conta Poupança", "CP"),
    CONTA_CORRENTE("Conta Corrente", "CC");

    private final String descricao;
    private final String codigo;

    TipoContaBancariaEnum(String descricao, String codigo) {
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
