package dh.specieservice.service;

import dh.specieservice.client.IAnimalClient;
import dh.specieservice.model.Animal;
import dh.specieservice.model.Specie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecieService {

    @Autowired
    private IAnimalClient iAnimalClient;


    public Specie getSpecieByName( String name){
       List<Animal> animals = iAnimalClient.getAnimalBySpecie(name).getBody();
       Specie specie = new Specie(name, animals);
        return specie;
    }
}




