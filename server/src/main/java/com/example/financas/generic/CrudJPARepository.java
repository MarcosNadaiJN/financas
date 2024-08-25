package com.example.financas.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CrudJPARepository<T, K> extends JpaRepository<T, K> {
}
