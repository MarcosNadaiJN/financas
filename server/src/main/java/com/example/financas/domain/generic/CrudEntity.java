package com.example.financas.domain.generic;

import java.io.Serializable;

public interface CrudEntity<K extends Serializable, D>  {

    K getId();

    void setId(K id);

    D toDTO();
}
