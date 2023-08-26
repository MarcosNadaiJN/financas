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
@Table(name = "tipopessoafisica")
public class PessoaFisica extends TipoPessoa{

    private String nome;

    private String cpf;

    private String sexo;
}
