package com.example.financas.domain.produto;

import com.example.financas.domain.pessoa.Fornecedor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@MappedSuperclass
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_sequence_produto")
    @SequenceGenerator(name = "gen_sequence_produto", sequenceName = "sequence_produto")
    private UUID id;

    private Fornecedor fornecedor;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaProduto categoria;

    private String modelo;

    private BigDecimal precoCompra = BigDecimal.ZERO;

    private BigDecimal precoVenda = BigDecimal.ZERO;

    private Float margemLucro;
}
