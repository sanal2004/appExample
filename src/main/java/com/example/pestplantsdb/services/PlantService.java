package com.example.pestplantsdb.services;

import com.example.pestplantsdb.models.Plants;
import com.example.pestplantsdb.repositories.PlantRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PlantService {
    private final PlantRepository plantRepository;

    public List<Plants> listPlants(String culturename) {
        if (culturename != null) return plantRepository.findByCulturename(culturename);
        return plantRepository.findAll();
    }

    public void savePlant(Plants plants){
        log.info("Saving new {}", plants);
        plantRepository.save(plants);
    }

    public void deletePlant(Long id) {
        plantRepository.deleteById(id);
    }

    public Plants getPlantById(Long id) {
        return plantRepository.findById(id).orElse(null);
    }
}

