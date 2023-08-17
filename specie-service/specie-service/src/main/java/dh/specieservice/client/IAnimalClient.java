package dh.specieservice.client;

import dh.specieservice.model.Animal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "ANIMAL-SERVICE")
public interface IAnimalClient {

    @GetMapping("/animal/{specie}")
    ResponseEntity<List<Animal>> getAnimalBySpecie(@PathVariable String specie);
}
