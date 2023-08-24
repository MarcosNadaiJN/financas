package com.example.financas.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "compra")
public class Compra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_sequence_compra")
    @SequenceGenerator(name = "gen_sequence_compra", sequenceName = "sequence_compra")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    @NotNull
    private Pessoa fornecedor;

    @NotNull
    private BigDecimal valorTotal = BigDecimal.ZERO;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "formadepagamento_id")
    private FormaDePagamento formaDePagamento;

    @NotNull
    private Long numeroDeParcelas;

    @ManyToMany
    @JoinTable(name = "produtos_id")
    private List<Produto> produtos;

    @ManyToMany
    @JoinColumn(name = "contaapagar_id")
    private List<ContasAPagar> contasAPagar;

    private String descricao;
}
