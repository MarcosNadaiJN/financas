package com.example.financas.resource;

import com.example.financas.domain.dto.ContaAPagarDTO;
import com.example.financas.domain.movimentacao.financeira.ContaAPagar;
import com.example.financas.resource.generic.CrudResource;
import com.example.financas.service.ContasAPagarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/contas-a-pagar")
public class ContasAPagarResource extends CrudResource<ContaAPagar, UUID, ContaAPagarDTO> {

    private final ContasAPagarService service;

    public ContasAPagarResource(ContasAPagarService service) {
        super(service);
        this.service = service;
    }

}
