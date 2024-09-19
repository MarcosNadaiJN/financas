package com.example.financas.repository;

import com.example.financas.domain.enums.FormaDePagamentoEnum;
import com.example.financas.domain.movimentacao.patrimonial.Compra;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Sql(scripts = {"/sql/pessoa.sql", "/sql/compra.sql"})
public class CompraRepositoryTest {

    @Autowired
    private CompraRepository compraRepository;

    @Test
    public void testFindById() {

        Optional<Compra> compraOptional = this.compraRepository.findById(UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479"));

        assertThat(compraOptional).isPresent();

        Compra compra = compraOptional.get();

        assertThat(compra.getValorTotal()).isEqualTo(BigDecimal.valueOf(12000.01));
        assertThat(compra.getFormaDePagamento()).isEqualTo(FormaDePagamentoEnum.CARTAO_CREDITO);
        assertThat(compra.getNumeroParcelas()).isEqualTo(12);
        assertThat(compra.getDescricao()).isEqualTo("Compra de climatizador");
        assertThat(compra.getFornecedor().getNome()).isEqualTo("nome fantasia 2");
    }
}
