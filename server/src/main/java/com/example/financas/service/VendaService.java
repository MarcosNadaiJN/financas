package com.example.financas.service;

import com.example.financas.domain.dto.VendaDTO;
import com.example.financas.domain.movimentacao.patrimonial.Venda;
import com.example.financas.generic.CrudJPAService;

import java.util.UUID;

public class VendaService extends CrudJPAService<Venda, UUID, VendaDTO> {
}
