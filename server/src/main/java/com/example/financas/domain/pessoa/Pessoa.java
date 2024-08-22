package com.example.financas.domain.pessoa;

import com.example.financas.domain.enums.CategoriaPessoaEnum;
import com.example.financas.domain.enums.SexoPessoa;
import com.example.financas.domain.enums.TipoPessoaEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid")
    private UUID id;

    @NotNull
    private TipoPessoaEnum tipoPessoa;

    @NotNull
    private CategoriaPessoaEnum categoriaPessoa;

    private SexoPessoa sexoPessoa;

    @NotNull
    private String cpfCnpj;

    @NotNull
    private String nomeRazaoSocial;

    private String nomeFantasia;

    private String telefone;

    private String email;

    @NotNull
    private String uf;

    @NotNull
    private String cidade;

    private String cep;

    private String logradouro;

    private Long numero;
}
