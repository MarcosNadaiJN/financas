package com.example.financas.domain.enums;

import com.example.financas.generic.enums.CodedEnum;

public enum FormaDePagamentoEnum implements CodedEnum {

    BOLETO("Boleto", "BO"),
    CARTAO_CREDITO("Cartão de Credito", "CC"),
    CARTAO_DEBITO("Cartão de Debito", "CD"),
    PIX("PIX", "PX"),
    TRANSFERENCIA("Transferência", "TR"),
    CHEQUE("Cheque", "CQ");

    private final String descricao;
    private final String codigo;

    FormaDePagamentoEnum(String descricao, String codigo) {
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
