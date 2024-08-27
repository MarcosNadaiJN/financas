package com.example.financas.resource;

import com.example.financas.domain.dto.CompraDTO;
import com.example.financas.domain.movimentacao.patrimonial.Compra;
import com.example.financas.generic.CrudJPAResource;
import com.example.financas.service.CompraService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/compras")
public class CompraResource extends CrudJPAResource<Compra, UUID, CompraDTO> {

    public CompraResource(CompraService service) {
        super(service);
    }
}
