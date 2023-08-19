package com.example.pestplantsdb.repositories;

import com.example.pestplantsdb.models.Plants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlantRepository extends JpaRepository<Plants, Long> {
    List<Plants> findByCulturename(String culturename);
}
