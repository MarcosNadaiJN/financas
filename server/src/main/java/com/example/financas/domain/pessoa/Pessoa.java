package com.example.financas.domain.pessoa;

import com.example.financas.domain.dto.PessoaDTO;
import com.example.financas.domain.enums.CategoriaPessoaEnum;
import com.example.financas.domain.enums.SexoPessoaEnum;
import com.example.financas.domain.enums.TipoPessoaEnum;
import com.example.financas.domain.enums.UnidadeFederalEnum;
import com.example.financas.domain.enums.converters.CategoriaPessoaEnumConverter;
import com.example.financas.domain.enums.converters.SexoPessoaEnumConverter;
import com.example.financas.domain.enums.converters.TipoPessoaEnumConverter;
import com.example.financas.domain.enums.converters.UnidadeFederalEnumConverter;
import com.example.financas.generic.CrudEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import java.util.UUID;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "pessoa")
public class Pessoa implements CrudEntity<UUID, PessoaDTO> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    @Column(name = "tipo_pessoa")
    @Convert(converter = TipoPessoaEnumConverter.class)
    private TipoPessoaEnum tipoPessoa;

    @NotNull
    @Column(name = "categoria_pessoa")
    @Convert(converter = CategoriaPessoaEnumConverter.class)
    private CategoriaPessoaEnum categoriaPessoa;

    @Column(name = "sexo_pessoa")
    @Convert(converter = SexoPessoaEnumConverter.class)
    private SexoPessoaEnum sexoPessoaEnum;

    @CPF
    private String cpf;

    @CNPJ
    private String cnpj;

    @Column(name = "razao_social")
    private String razaoSocial;

    @NotNull
    private String nome;

    private String telefone;

    private String email;

    @NotNull
    @Convert(converter = UnidadeFederalEnumConverter.class)
    private UnidadeFederalEnum uf;

    @NotNull
    private String cidade;

    private String cep;

    private String logradouro;

    private Long numero;

    @Override
    public PessoaDTO toDTO() {
        PessoaDTO dto = new PessoaDTO();
        dto.setId(this.id);
        dto.setTipoPessoa(this.tipoPessoa);
        dto.setCategoriaPessoa(this.categoriaPessoa);
        dto.setSexoPessoaEnum(this.sexoPessoaEnum);
        dto.setCpf(this.cpf);
        dto.setCnpj(this.cnpj);
        dto.setRazaoSocial(this.razaoSocial);
        dto.setNome(this.nome);
        dto.setTelefone(this.telefone);
        dto.setEmail(this.email);
        dto.setUf(this.uf.getCodigo());
        dto.setCidade(this.cidade);
        dto.setCep(this.cep);
        dto.setLogradouro(this.logradouro);
        dto.setNumero(this.numero);
        return dto;
    }
}
