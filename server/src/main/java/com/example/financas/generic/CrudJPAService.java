package com.example.financas.generic;

import com.example.financas.exceptions.RegistroNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public class CrudJPAService<T extends CrudEntity<K, D>, K extends Serializable, D> {

    @Autowired
    private CrudJPARepository<T, K> repository;

    public D save(T entity) {
        return this.repository.saveAndFlush(entity).toDTO();
    }

    public D findById(K id) {
        return this.repository.findById(id).orElseThrow().toDTO();
    }

    public List<D> findAll() {
        return this.repository.findAll().stream().map(CrudEntity::toDTO).collect(Collectors.toList());
    }

    public D update(K id, T entity) {
        if (!this.repository.existsById(id)) {
            throw new RegistroNaoEncontradoException("Registro não encontrado.");
        }
        return this.repository.saveAndFlush(entity).toDTO();
    }

    public void delete(K id) {
        this.repository.deleteById(id);
    }
}
