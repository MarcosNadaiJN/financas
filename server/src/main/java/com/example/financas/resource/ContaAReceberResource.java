package com.example.financas.resource;

import com.example.financas.domain.dto.ContaAReceberDTO;
import com.example.financas.domain.movimentacao.financeira.ContaAReceber;
import com.example.financas.generic.CrudJPAResource;
import com.example.financas.service.ContaAReceberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/contas-a-receber")
public class ContaAReceberResource extends CrudJPAResource<ContaAReceber, UUID, ContaAReceberDTO> {
    public ContaAReceberResource(ContaAReceberService service) {
        super(service);
    }
}
