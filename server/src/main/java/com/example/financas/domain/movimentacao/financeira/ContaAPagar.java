package com.example.financas.domain.movimentacao.financeira;

import com.example.financas.domain.dto.ContaAPagarDTO;
import com.example.financas.domain.generic.CrudEntity;
import com.example.financas.domain.movimentacao.patrimonial.Compra;
import com.example.financas.domain.pessoa.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "conta_a_pagar")
public class ContaAPagar implements Serializable, CrudEntity<UUID, ContaAPagarDTO> {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID id;

    @NotNull
    private BigDecimal valorInicial = BigDecimal.ZERO;

    private BigDecimal valorPago = BigDecimal.ZERO;

    private BigDecimal jurosPago = BigDecimal.ZERO;

    @NotNull
    private LocalDate dataVencimento;

    private LocalDateTime dataPagamento;

    private String descricao;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fornecedor_id")
    private Pessoa fornecedor;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "compra_origem_id")
    private Compra compra;


    @Override
    public ContaAPagarDTO toDTO() {
        return null;
    }
}
