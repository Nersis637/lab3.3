package com.example.graphqlserver.repo;

import com.example.graphqlserver.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoDoctor  extends CrudRepository<Doctor, Long> {

}