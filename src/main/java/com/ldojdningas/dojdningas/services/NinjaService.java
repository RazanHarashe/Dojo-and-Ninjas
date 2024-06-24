package com.ldojdningas.dojdningas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldojdningas.dojdningas.models.Ninja;
import com.ldojdningas.dojdningas.repositories.NinjaRepository;

import java.util.List;

@Service
public class NinjaService {
    @Autowired
    private NinjaRepository ninjaRepository;

    public List<Ninja> getAllNinjas() {
        return ninjaRepository.findAll();
    }

    public Ninja getNinjaById(Long id) {
        return ninjaRepository.findById(id).orElse(null);
    }

    public Ninja createNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }
}


