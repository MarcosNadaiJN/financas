package com.example.financas.generic;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;

public class CrudJPAResource<T extends CrudEntity<K, D>, K extends Serializable, D> {

    private final CrudJPAService<T, K ,D> service;

    public CrudJPAResource(CrudJPAService<T, K, D> service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<D> save(@RequestBody T entity) {
        return ResponseEntity.ok(this.service.save(entity));
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> findById(@PathVariable K id) {
        return ResponseEntity.ok(this.service.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<D>> findAll() {
        return ResponseEntity.ok(this.service.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<D> update(@PathVariable K id, @RequestBody T entity) {
        return ResponseEntity.ok(this.service.update(id, entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable K id) {
        this.service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
