package com.example.financas.domain.movimentacao.patrimonial;

import com.example.financas.domain.enums.FormaDePagamentoEnum;
import com.example.financas.domain.movimentacao.financeira.ContaAReceber;
import com.example.financas.domain.pessoa.Pessoa;
import com.example.financas.domain.produto.Produto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "venda")
public class Venda implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID id;

    @NotNull
    private BigDecimal valorTotal = BigDecimal.ZERO;

    @NotNull
    @Column(name = "formadepagamento")
    private FormaDePagamentoEnum formaDePagamento;

    @NotNull
    private Long numeroParcelas;

    private String descricao;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Pessoa cliente;

    @OneToMany(mappedBy = "venda")
    private List<ContaAReceber> contasAReceber;

    @OneToMany(mappedBy = "venda")
    private List<Produto> produtos;
}
