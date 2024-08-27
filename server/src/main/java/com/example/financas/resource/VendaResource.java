package com.example.financas.resource;

import com.example.financas.domain.dto.VendaDTO;
import com.example.financas.domain.movimentacao.patrimonial.Venda;
import com.example.financas.generic.CrudJPAResource;
import com.example.financas.service.VendaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/vendas")
public class VendaResource extends CrudJPAResource<Venda, UUID, VendaDTO> {
    public VendaResource(VendaService service) {
        super(service);
    }
}
