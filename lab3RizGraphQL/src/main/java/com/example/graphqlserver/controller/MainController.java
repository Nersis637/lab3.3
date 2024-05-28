package com.example.graphqlserver.controller;

import com.example.graphqlserver.entity.Doctor;
import com.example.graphqlserver.repo.RepoDoctor;
import com.example.graphqlserver.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @Autowired
    private DoctorService doctorService;

    @QueryMapping
    public Iterable<Doctor> doctors(){
        return doctorService.getAll();
    }
    @QueryMapping
    public Doctor doctorById(@Argument Long id){
        return doctorService.getById(id);
    }
}
