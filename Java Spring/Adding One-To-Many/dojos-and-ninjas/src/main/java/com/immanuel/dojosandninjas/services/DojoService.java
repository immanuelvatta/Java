package com.immanuel.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immanuel.dojosandninjas.models.Dojo;
import com.immanuel.dojosandninjas.repositories.DojoRepository;


@Service
public class DojoService {

    @Autowired
    DojoRepository dojoRepository;

    public void addDojo(Dojo dojo) {
        dojoRepository.save(dojo);
    }

    public List<Dojo> getAllDojos() {
        return dojoRepository.findAll();
    }

    public Dojo findDojoById(Long id) {
        return dojoRepository.findById(id).orElse(null);
    }
}