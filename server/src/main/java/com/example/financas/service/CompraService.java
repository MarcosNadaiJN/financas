package com.example.financas.service;

import com.example.financas.domain.dto.CompraDTO;
import com.example.financas.domain.movimentacao.patrimonial.Compra;
import com.example.financas.generic.CrudJPAService;

import java.util.UUID;

public class CompraService extends CrudJPAService<Compra, UUID, CompraDTO> {
}
