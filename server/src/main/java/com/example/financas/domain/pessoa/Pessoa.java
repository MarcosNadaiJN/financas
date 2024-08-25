package com.example.financas.domain.pessoa;

import com.example.financas.domain.dto.PessoaDTO;
import com.example.financas.domain.enums.CategoriaPessoaEnum;
import com.example.financas.domain.enums.SexoPessoa;
import com.example.financas.domain.enums.TipoPessoaEnum;
import com.example.financas.generic.CrudEntity;
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

import java.io.Serializable;
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
    private TipoPessoaEnum tipoPessoa;

    @NotNull
    private CategoriaPessoaEnum categoriaPessoa;

    private SexoPessoa sexoPessoa;

    @NotNull
    private String cpfCnpj;

    @NotNull
    private String nomeRazaoSocial;

    private String nomeFantasia;

    private String telefone;

    private String email;

    @NotNull
    private String uf;

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
        dto.setSexoPessoa(this.sexoPessoa);
        dto.setCpfCnpj(this.cpfCnpj);
        dto.setNomeRazaoSocial(this.nomeRazaoSocial);
        dto.setNomeFantasia(this.nomeFantasia);
        dto.setTelefone(this.telefone);
        dto.setEmail(this.email);
        dto.setUf(this.uf);
        dto.setCidade(this.cidade);
        dto.setCep(this.cep);
        dto.setLogradouro(this.logradouro);
        dto.setNumero(this.numero);
        return dto;
    }
}
