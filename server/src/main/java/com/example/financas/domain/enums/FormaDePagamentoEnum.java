package com.example.financas.domain.enums;

public enum FormaDePagamentoEnum {

    BOLETO("Boleto", 1),
    CARTAO("Cartão", 2),
    PIX("PIX", 3),
    TRANSFERENCIA("Transferência", 4),
    CHEQUE("Cheque", 5);

    private final String descricao;
    private final Integer codigo;

    FormaDePagamentoEnum(String descricao, Integer codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }
}
