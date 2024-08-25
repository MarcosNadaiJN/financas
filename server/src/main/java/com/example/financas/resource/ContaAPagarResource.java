package com.example.financas.resource;

import com.example.financas.domain.dto.ContaAPagarDTO;
import com.example.financas.domain.movimentacao.financeira.ContaAPagar;
import com.example.financas.generic.CrudJPAResource;
import com.example.financas.service.ContaAPagarService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/contas-a-pagar")
public class ContaAPagarResource extends CrudJPAResource<ContaAPagar, UUID, ContaAPagarDTO> {
    public ContaAPagarResource(ContaAPagarService service) {
        super(service);
    }
}
