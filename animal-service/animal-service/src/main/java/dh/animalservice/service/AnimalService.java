package dh.animalservice.service;

import dh.animalservice.model.Animal;
import dh.animalservice.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> findBySpecie(String specie) {
        return animalRepository.findBySpecie(specie);

    }

    public Animal save(Animal animal) {
        return animalRepository.save(animal);
    }

}