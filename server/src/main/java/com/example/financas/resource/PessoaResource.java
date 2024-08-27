package com.example.financas.resource;

import com.example.financas.domain.dto.PessoaDTO;
import com.example.financas.domain.pessoa.Pessoa;
import com.example.financas.generic.CrudJPAResource;
import com.example.financas.service.PessoaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource extends CrudJPAResource<Pessoa, UUID, PessoaDTO> {

    public PessoaResource(PessoaService service) {
        super(service);
    }
}