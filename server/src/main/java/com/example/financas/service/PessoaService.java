package com.example.financas.service;

import com.example.financas.domain.dto.PessoaDTO;
import com.example.financas.domain.pessoa.Pessoa;
import com.example.financas.generic.CrudJPAService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PessoaService extends CrudJPAService<Pessoa, UUID, PessoaDTO> {

}
