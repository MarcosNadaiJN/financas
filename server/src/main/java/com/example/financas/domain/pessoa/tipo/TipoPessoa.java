package com.example.financas.domain.pessoa.tipo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
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
public abstract class TipoPessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_sequence_tipopessoa")
    @SequenceGenerator(name = "gen_sequence_tipopessoa", sequenceName = "sequence_tipopessoa")
    private UUID id;
}
