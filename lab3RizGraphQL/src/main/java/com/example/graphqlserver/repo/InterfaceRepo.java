package com.example.graphqlserver.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface InterfaceRepo<T> extends CrudRepository<T, Integer> {
}
