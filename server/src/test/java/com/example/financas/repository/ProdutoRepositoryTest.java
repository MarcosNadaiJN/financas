package com.example.financas.repository;

import com.example.financas.domain.produto.Produto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Sql(scripts = {"/sql/categoria_produto.sql", "/sql/produto.sql"})
public class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Test
    public void testFindById() {

        Optional<Produto> produtoOptional = this.produtoRepository.findById(UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479"));

        assertThat(produtoOptional).isPresent();

        Produto produto = produtoOptional.get();

        assertThat(produto.getCategoria().getDescricao()).isEqualTo("descrição 1");
        assertThat(produto.getMarca()).isEqualTo("m.w.m");
        assertThat(produto.getModelo()).isEqualTo("k30");
        assertThat(produto.getDescricao()).isEqualTo("climatizador de teto");
    }

    @Test
    public void findByCategoria() {

        List<Produto> produtos = this.produtoRepository.findAllByCategoriaId(UUID.fromString("0317db03-41cd-4934-b5a5-c6c36e3e1494"));

        assertThat(produtos).hasSize(2);

        Produto produto = produtos.get(0);

        assertThat(produto.getCategoria().getDescricao()).isEqualTo("descrição 1");
        assertThat(produto.getMarca()).isEqualTo("m.w.m");
        assertThat(produto.getModelo()).isEqualTo("k30");
        assertThat(produto.getDescricao()).isEqualTo("climatizador de teto");
    }
}
