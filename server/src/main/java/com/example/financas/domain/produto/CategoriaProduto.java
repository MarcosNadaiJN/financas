package com.example.financas.domain.produto;

import com.example.financas.domain.dto.CategoriaProdutoDTO;
import com.example.financas.generic.CrudEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "categoria_produto")
public class CategoriaProduto implements CrudEntity<UUID, CategoriaProdutoDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private Long codigo;

    @Length(max = 50)
    private String descricao;

    @Override
    public CategoriaProdutoDTO toDTO() {

        CategoriaProdutoDTO categoriaProdutoDTO = new CategoriaProdutoDTO();

        categoriaProdutoDTO.setId(this.id);
        categoriaProdutoDTO.setCodigo(this.codigo);
        categoriaProdutoDTO.setDescricao(this.descricao);
        return categoriaProdutoDTO;
    }
}
