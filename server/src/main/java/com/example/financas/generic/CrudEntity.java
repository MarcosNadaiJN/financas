package com.example.financas.generic;

import java.io.Serializable;
import java.util.UUID;

public interface CrudEntity<K extends Serializable, D> extends Serializable  {

    K getId();

    void setId(UUID id);

    D toDTO();
}
