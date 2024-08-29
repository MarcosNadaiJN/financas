package com.example.financas.domain.dto;

import com.example.financas.domain.enums.CategoriaPessoaEnum;
import com.example.financas.domain.enums.SexoPessoaEnum;
import com.example.financas.domain.enums.TipoPessoaEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class PessoaDTO {

    private UUID id;
    private TipoPessoaEnum tipoPessoa;
    private CategoriaPessoaEnum categoriaPessoa;
    private SexoPessoaEnum sexoPessoaEnum;
    private String cpf;
    private String cnpj;
    private String razaoSocial;
    private String nome;
    private String telefone;
    private String email;
    private String uf;
    private String cidade;
    private String cep;
    private String logradouro;
    private Long numero;
}
