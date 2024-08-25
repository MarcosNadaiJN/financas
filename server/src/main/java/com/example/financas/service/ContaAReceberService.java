package com.example.financas.service;

import com.example.financas.domain.dto.ContaAReceberDTO;
import com.example.financas.domain.movimentacao.financeira.ContaAReceber;
import com.example.financas.generic.CrudJPAService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ContaAReceberService extends CrudJPAService<ContaAReceber, UUID, ContaAReceberDTO> {
}
