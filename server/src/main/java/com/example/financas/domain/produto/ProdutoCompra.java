package com.example.financas.domain.produto;

import com.example.financas.domain.dto.ProdutoCompraDTO;
import com.example.financas.domain.movimentacao.patrimonial.Compra;
import com.example.financas.generic.CrudEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
@Table(name = "produto_compra")
public class ProdutoCompra implements CrudEntity<UUID, ProdutoCompraDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "compra_id")
    private Compra compra;

    @Column(name = "preco_compra")
    private BigDecimal precoCompra = BigDecimal.ZERO;

    @Column(name = "quantidade")
    private BigDecimal quantidade = BigDecimal.ZERO;

    @Override
    public ProdutoCompraDTO toDTO() {

        ProdutoCompraDTO dto = new ProdutoCompraDTO();

        dto.setId(this.getId());
        dto.setProdutoid(this.getProduto().getId());
        dto.setCompraId(this.getCompra().getId());
        dto.setPrecoCompra(this.getPrecoCompra());
        dto.setQuantidade(this.getQuantidade());
        return dto;
    }
}
