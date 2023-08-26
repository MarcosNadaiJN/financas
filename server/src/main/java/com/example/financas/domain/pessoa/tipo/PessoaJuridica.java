package com.example.financas.domain.pessoa.tipo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "tipopessoajuridica")
public class PessoaJuridica extends TipoPessoa{

    private String cnpj;

    private String nomeFantasia;

    private String razaoSocial;
}
