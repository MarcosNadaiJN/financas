package com.example.financas.domain.dto;

import com.example.financas.domain.enums.CategoriaPessoaEnum;
import com.example.financas.domain.enums.SexoPessoa;
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
    private SexoPessoa sexoPessoa;
    private String cpfCnpj;
    private String nomeRazaoSocial;
    private String nomeFantasia;
    private String telefone;
    private String email;
    private String uf;
    private String cidade;
    private String cep;
    private String logradouro;
    private Long numero;
}
