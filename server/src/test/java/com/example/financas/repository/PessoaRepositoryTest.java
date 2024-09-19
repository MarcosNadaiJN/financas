package com.example.financas.repository;

import com.example.financas.domain.enums.CategoriaPessoaEnum;
import com.example.financas.domain.enums.SexoPessoaEnum;
import com.example.financas.domain.enums.TipoPessoaEnum;
import com.example.financas.domain.enums.UnidadeFederalEnum;
import com.example.financas.domain.pessoa.Pessoa;
import com.example.financas.domain.produto.CategoriaProduto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Sql(scripts = {"/sql/pessoa.sql"})
public class PessoaRepositoryTest {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Test
    public void testFindById() {

        Optional<Pessoa> pessoaOptional = this.pessoaRepository.findById(UUID.fromString("d002ebd7-46bf-48f7-8685-5387cf164607"));

        assertThat(pessoaOptional).isPresent();

        Pessoa pessoa = pessoaOptional.get();

        assertThat(pessoa.getId()).isEqualTo(UUID.fromString("d002ebd7-46bf-48f7-8685-5387cf164607"));
        assertThat(pessoa.getTipoPessoa()).isEqualTo(TipoPessoaEnum.FISICA);
        assertThat(pessoa.getCategoriaPessoa()).isEqualTo(CategoriaPessoaEnum.CLIENTE);
        assertThat(pessoa.getSexoPessoaEnum()).isEqualTo(SexoPessoaEnum.INEXISTENTE);
        assertThat(pessoa.getCpf()).isEqualTo("999.999.999-99");
        assertThat(pessoa.getCnpj()).isEqualTo("99.999.999/9999-99");
        assertThat(pessoa.getRazaoSocial()).isEqualTo("razão social");
        assertThat(pessoa.getNome()).isEqualTo("nome fantasia");
        assertThat(pessoa.getTelefone()).isEqualTo("44999999999");
        assertThat(pessoa.getEmail()).isEqualTo("email@email.com");
        assertThat(pessoa.getUf()).isEqualTo(UnidadeFederalEnum.PR);
        assertThat(pessoa.getCidade()).isEqualTo("cidade");
        assertThat(pessoa.getCep()).isEqualTo("87600-000");
        assertThat(pessoa.getLogradouro()).isEqualTo("AVENIDA TESTE");
        assertThat(pessoa.getNumero()).isEqualTo(12345L);
    }
}
