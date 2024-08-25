package com.example.financas.resource;

import com.example.financas.domain.dto.ProdutoDTO;
import com.example.financas.domain.dto.VendaDTO;
import com.example.financas.domain.movimentacao.patrimonial.Venda;
import com.example.financas.domain.produto.Produto;
import com.example.financas.generic.CrudJPAResource;
import com.example.financas.service.ProdutoService;
import com.example.financas.service.VendaService;

import java.util.UUID;

public class VendaResource extends CrudJPAResource<Venda, UUID, VendaDTO> {
    public VendaResource(VendaService service) {
        super(service);
    }
}
