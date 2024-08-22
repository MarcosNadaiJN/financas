package com.example.financas.domain.enums;

public enum CategoriaPessoaEnum {

    BANCO("Banco", 1L),
    FUNCIONARIO("Funcionário", 2L),
    FORNECEDOR("Fornecedor", 3L),
    CLIENTE("Cliente", 4L);

    private final String descricao;
    private final Long codigo;

    CategoriaPessoaEnum(String descricao, Long codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Long getCodigo() {
        return codigo;
    }
}
