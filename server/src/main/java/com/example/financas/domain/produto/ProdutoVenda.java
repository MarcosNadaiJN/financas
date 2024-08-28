package com.example.financas.domain.produto;

import com.example.financas.domain.dto.ProdutoVendaDTO;
import com.example.financas.domain.movimentacao.patrimonial.Venda;
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
@Table(name = "produto_venda")
public class ProdutoVenda implements CrudEntity<UUID, ProdutoVendaDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "venda_id")
    private Venda venda;

    @Column(name = "preco_venda")
    private BigDecimal precoVenda = BigDecimal.ZERO;

    @Column(name = "quantidade")
    private BigDecimal quantidade = BigDecimal.ZERO;

    @Override
    public ProdutoVendaDTO toDTO() {

        ProdutoVendaDTO dto = new ProdutoVendaDTO();

        dto.setId(this.getId());
        dto.setProdutoid(this.getProduto().getId());
        dto.setVendaId(this.getVenda().getId());
        dto.setPrecoVenda(this.getPrecoVenda());
        dto.setQuantidade(this.getQuantidade());
        return dto;
    }

}
