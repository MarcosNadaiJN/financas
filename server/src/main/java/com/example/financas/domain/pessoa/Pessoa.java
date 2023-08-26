package com.example.financas.domain.pessoa;

import com.example.financas.domain.pessoa.tipo.TipoPessoa;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@MappedSuperclass
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_sequence_pessoa")
    @SequenceGenerator(name = "gen_sequence_pessoa", sequenceName = "sequence_pessoa")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "tipopessoa_id")
    private TipoPessoa tipoPessoa;

    private String telefone;

    private String email;

    private String uf;

    private String cidade;

    private String cep;

    private String logradouro;

    private Long numero;
}
