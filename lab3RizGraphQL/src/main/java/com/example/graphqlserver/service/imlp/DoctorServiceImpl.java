package com.example.graphqlserver.service.imlp;

import com.example.graphqlserver.entity.Doctor;
import com.example.graphqlserver.repo.RepoDoctor;
import com.example.graphqlserver.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private RepoDoctor repoDoctor;

    @Override
    public Doctor getById(Long id) {
        return repoDoctor.findById(id).orElseThrow(null);
    }

    @Override
    public List<Doctor> getAll() {
        return (List<Doctor>) repoDoctor.findAll();
    }
}
