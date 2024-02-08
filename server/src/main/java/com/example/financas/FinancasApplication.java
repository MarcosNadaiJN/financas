package com.example.financas;

import com.example.financas.domain.enums.FormaDePagamentoEnum;
import com.example.financas.domain.enums.TipoPessoaEnum;
import com.example.financas.domain.movimentacao.financeira.ContasAPagar;
import com.example.financas.domain.movimentacao.financeira.ContasAReceber;
import com.example.financas.domain.movimentacao.patrimonial.Compra;
import com.example.financas.domain.movimentacao.patrimonial.Venda;
import com.example.financas.domain.pessoa.Cliente;
import com.example.financas.domain.pessoa.Fornecedor;
import com.example.financas.repository.ClienteRepository;
import com.example.financas.repository.CompraRepository;
import com.example.financas.repository.ContasAPagarRepository;
import com.example.financas.repository.ContasAReceberRepository;
import com.example.financas.repository.FornecedorRepository;
import com.example.financas.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class FinancasApplication implements CommandLineRunner {

    @Autowired
    private ContasAPagarRepository contasAPagarRepository;

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @Autowired
    private CompraRepository compraRepository;

    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private ContasAReceberRepository contasAReceberRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    public static void main(String[] args) {
        SpringApplication.run(FinancasApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setTipoPessoa(TipoPessoaEnum.PESSOA_JURIDICA);
        fornecedor.setCpfCnpj("123123123123");
        fornecedor.setNomeRazaoSocial("razao social");
        fornecedor.setUf("PR");
        fornecedor.setCidade("cidade");

        Fornecedor fornecedorSalvo = fornecedorRepository.saveAndFlush(fornecedor);

        Compra compra = new Compra();
        compra.setFornecedor(fornecedor);
        compra.setFormaDePagamento(FormaDePagamentoEnum.BOLETO);
        compra.setNumeroDeParcelas(1L);

        Compra coompraSalva = compraRepository.saveAndFlush(compra);

        ContasAPagar conta = new ContasAPagar();
        conta.setDescricao("teste");
        conta.setDataVencimento(LocalDateTime.now());
        conta.setFornecedor(fornecedorSalvo);
        conta.setCompra(coompraSalva);

        contasAPagarRepository.saveAndFlush(conta);

        Cliente cliente = new Cliente();
        cliente.setTipoPessoa(TipoPessoaEnum.PESSOA_JURIDICA);
        cliente.setCpfCnpj("123123123123");
        cliente.setNomeRazaoSocial("razao social");
        cliente.setUf("PR");
        cliente.setCidade("cidade");

        Cliente clienteSalvo = clienteRepository.saveAndFlush(cliente);

        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setFormaDePagamento(FormaDePagamentoEnum.BOLETO);
        venda.setNumeroDeParcelas(1L);

        Venda vendaSalva = vendaRepository.saveAndFlush(venda);

        ContasAReceber contasAReceber = new ContasAReceber();
        contasAReceber.setDescricao("teste");
        contasAReceber.setDataVencimento(LocalDateTime.now());
        contasAReceber.setCliente(clienteSalvo);
        contasAReceber.setVenda(vendaSalva);

        contasAReceberRepository.saveAndFlush(contasAReceber);

    }
}
