package com.example.financas.service;

import com.example.financas.domain.dto.VendaDTO;
import com.example.financas.domain.movimentacao.patrimonial.Venda;
import com.example.financas.generic.CrudJPAService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VendaService extends CrudJPAService<Venda, UUID, VendaDTO> {
}
