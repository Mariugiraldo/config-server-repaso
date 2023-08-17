package dh.animalservice.controller;


import dh.animalservice.model.Animal;
import dh.animalservice.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/{specie}")
    public ResponseEntity<List<Animal>>getAnimalBySpecie(@PathVariable String specie){
        return ResponseEntity.ok().body(animalService.findBySpecie(specie));

    }

    @PostMapping
    ResponseEntity<Animal> saveAnimal(@RequestBody Animal animal){
        return ResponseEntity.ok().body(animalService.save(animal));
    }


}
