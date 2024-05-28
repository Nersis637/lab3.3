package com.example.graphqlserver.service;

import com.example.graphqlserver.entity.Doctor;


public interface DoctorService {
    Doctor getById(Long id);
    Iterable<Doctor> getAll();
}
