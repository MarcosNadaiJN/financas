package com.example.financas.repository;

import com.example.financas.domain.pessoa.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
}
