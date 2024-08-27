package com.example.financas.domain.produto;

import com.example.financas.domain.dto.ProdutoDTO;
import com.example.financas.domain.movimentacao.patrimonial.Compra;
import com.example.financas.domain.movimentacao.patrimonial.Venda;
import com.example.financas.domain.pessoa.Pessoa;
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
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "produto") //TODO - ajustar tabela
public class Produto implements CrudEntity<UUID, ProdutoDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    private CategoriaProduto categoria;

    private String marca;

    private String modelo;

    private String descricao;

    @Override
    public ProdutoDTO toDTO() {

        ProdutoDTO dto = new ProdutoDTO();

        dto.setId(this.id);
        dto.setMarca(this.marca);
        dto.setModelo(this.modelo);
        dto.setDescricao(this.descricao);
        return dto;
    }

}
