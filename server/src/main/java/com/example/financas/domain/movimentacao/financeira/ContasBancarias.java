package com.example.financas.domain.movimentacao.financeira;

import com.example.financas.domain.enums.TipoContaBancariaEnum;
import com.example.financas.domain.pessoa.Banco;
import com.example.financas.domain.pessoa.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "conta_bancaria")
public class ContasBancarias {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_sequence_cb")
    @SequenceGenerator(name = "gen_sequence_cb", sequenceName = "sequence_cb")
    private UUID id;

    @NotNull
    private Banco banco;

    @NotNull
    private TipoContaBancariaEnum tipo;

    @NotNull
    private String numeroConta;

    @NotNull
    private String agencia;

    private BigDecimal saldo = BigDecimal.ZERO;

    @NotNull
    private Pessoa titularConta;
}
