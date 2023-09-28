package com.example.financas.domain.movimentacao.patrimonial;

import com.example.financas.domain.formapagamento.FormaDePagamento;
import com.example.financas.domain.produto.Produto;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class MovimentacaoPatrimonial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_sequence_movpat")
    @SequenceGenerator(name = "gen_sequence_movpat", sequenceName = "sequence_movpat")
    private UUID id;

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

    private String descricao;
}
