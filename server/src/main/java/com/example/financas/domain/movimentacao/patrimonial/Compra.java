package com.example.financas.domain.movimentacao.patrimonial;

import com.example.financas.domain.movimentacao.financeira.ContasAPagar;
import com.example.financas.domain.pessoa.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "compra")
public class Compra extends MovimentacaoPatrimonial implements Serializable {

    @NotNull
    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Pessoa fornecedor;

    @OneToMany(mappedBy = "compra")
    private List<ContasAPagar> contasAPagar;
}
