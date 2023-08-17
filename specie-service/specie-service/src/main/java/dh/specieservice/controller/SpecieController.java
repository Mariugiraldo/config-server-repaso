package dh.specieservice.controller;


import dh.specieservice.model.Specie;
import dh.specieservice.service.SpecieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping("/specie")
@RestController
public class SpecieController {

    @Autowired
    private SpecieService specieService;

    @GetMapping("/{specie}")
    public Specie getSpecie (@PathVariable String specie){
        return specieService.getSpecieByName(specie);
    }


}
