package dh.animalservice.repository;

import dh.animalservice.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, String> {
    List<Animal> findBySpecie(String specie);

}
