package com.example.financas.service;

import com.example.financas.domain.dto.CompraDTO;
import com.example.financas.domain.movimentacao.patrimonial.Compra;
import com.example.financas.generic.CrudJPAService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CompraService extends CrudJPAService<Compra, UUID, CompraDTO> {
}
