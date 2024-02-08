package com.example.financas.domain.pessoa;

import com.example.financas.domain.enums.TipoPessoaEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;
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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Pessoa {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID id;

    @NotNull
    private TipoPessoaEnum tipoPessoa;

    @NotNull
    private String cpfCnpj;

    @NotNull
    private String nomeRazaoSocial;

    private String nomeFantasia;

    private String sexo;

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
