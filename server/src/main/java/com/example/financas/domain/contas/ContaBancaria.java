package com.example.financas.domain.contas;

import com.example.financas.domain.dto.ContaBancariaDTO;
import com.example.financas.domain.enums.TipoContaBancariaEnum;
import com.example.financas.domain.enums.converters.TipoContaBancariaEnumConverter;
import com.example.financas.domain.pessoa.Pessoa;
import com.example.financas.generic.CrudEntity;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "conta_bancaria")
public class ContaBancaria implements CrudEntity<UUID, ContaBancariaDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "banco_id")
    private Pessoa banco;

    @NotNull
    @Convert(converter = TipoContaBancariaEnumConverter.class)
    private TipoContaBancariaEnum tipo;

    @NotNull
    private String numeroConta;

    @NotNull
    private String agencia;

    private BigDecimal saldo = BigDecimal.ZERO;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "funcionario_id")
    private Pessoa titularConta;

    @Override
    public ContaBancariaDTO toDTO() {

        ContaBancariaDTO dto = new ContaBancariaDTO();

        dto.setId(this.id);
        dto.setTipo(this.tipo);
        dto.setNumeroConta(this.numeroConta);
        dto.setAgencia(this.agencia);
        dto.setSaldo(this.saldo);
        return dto;
    }

}
