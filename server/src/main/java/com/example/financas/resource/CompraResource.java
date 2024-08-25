package com.example.financas.resource;

import com.example.financas.domain.dto.CompraDTO;
import com.example.financas.domain.movimentacao.patrimonial.Compra;
import com.example.financas.generic.CrudJPAResource;
import com.example.financas.service.CompraService;

import java.util.UUID;

public class CompraResource extends CrudJPAResource<Compra, UUID, CompraDTO> {

    public CompraResource(CompraService service) {
        super(service);
    }
}
