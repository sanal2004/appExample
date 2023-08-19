package com.example.pestplantsdb.controllers;

import com.example.pestplantsdb.models.Plants;
import com.example.pestplantsdb.services.PlantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class PlantsController {
    private final PlantService plantService;

    @GetMapping("/")
    public String plants(@RequestParam(name = "culturename", required = false)String culturename, Model model){
        model.addAttribute("plants", plantService.listPlants(culturename));
        return "plants";
    }
    @GetMapping("/plant/{id}")
    public String plantInfo(@PathVariable Long id, Model model){
        model.addAttribute("plant", plantService.getPlantById(id));
        return "plant-info";
    }


    @PostMapping("/plant/create")
    public String createPlant(Plants plants){
        plantService.savePlant(plants);
        return "redirect:/";
    }
    @PostMapping("/plant/delete/{id}")
    public String deletePlant(@PathVariable Long id){
        plantService.deletePlant(id);
        return "redirect:/";
    }

}

