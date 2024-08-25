package com.example.financas.service;

import com.example.financas.domain.dto.ContaAPagarDTO;
import com.example.financas.domain.movimentacao.financeira.ContaAPagar;
import com.example.financas.generic.CrudJPAService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ContaAPagarService extends CrudJPAService<ContaAPagar, UUID, ContaAPagarDTO> {
}
