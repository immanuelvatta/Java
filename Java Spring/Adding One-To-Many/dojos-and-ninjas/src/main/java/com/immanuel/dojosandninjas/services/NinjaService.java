package com.immanuel.dojosandninjas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immanuel.dojosandninjas.models.Ninja;
import com.immanuel.dojosandninjas.repositories.NinjaRepository;

import jakarta.validation.Valid;

@Service
public class NinjaService {

    @Autowired
    NinjaRepository ninjaRepository;

    public void addNinja(@Valid Ninja ninja) {
        ninjaRepository.save(ninja);
    }
}