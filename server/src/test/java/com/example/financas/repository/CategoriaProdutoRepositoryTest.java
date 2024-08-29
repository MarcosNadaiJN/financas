package com.example.financas.repository;

import com.example.financas.domain.produto.CategoriaProduto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Sql(scripts = {"/sql/categoriaProdutoInsert.sql"})
public class CategoriaProdutoRepositoryTest {

    @Autowired
    private CategoriaProdutoRepository categoriaProdutoRepository;

    @Test
    public void testFindById() {

        Optional<CategoriaProduto> categoriaProdutoOptional = this.categoriaProdutoRepository.findById(UUID.fromString("0317db03-41cd-4934-b5a5-c6c36e3e1494"));

        assertThat(categoriaProdutoOptional).isPresent();

        CategoriaProduto categoriaProduto = categoriaProdutoOptional.get();

        assertThat(categoriaProduto.getCodigo()).isEqualTo(1L);
        assertThat(categoriaProduto.getDescricao()).isEqualTo("descrição 1");
    }
}
