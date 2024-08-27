package com.example.financas.domain.enums;

public enum FormaDePagamentoEnum {

    BOLETO("Boleto", 1),
    CARTAO_CREDITO("Cartão de Credito", 2),
    CARTAO_DEBITO("Cartão de Debito", 3),
    PIX("PIX", 4),
    TRANSFERENCIA("Transferência", 5),
    CHEQUE("Cheque", 6);

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
