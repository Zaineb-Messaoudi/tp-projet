package tn.esprit.tpprojet.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpprojet.entites.Equipe;
import tn.esprit.tpprojet.services.IEquipe;

import java.util.List;

@RestController
@RequestMapping("/equipecontroller")
public class EquipeController {
    @Autowired
    IEquipe equipeService;

    @PostMapping("/addEquipe")
    Equipe addEquipe(@RequestBody Equipe equipe) {
        return equipeService.addOrUpdateEquipe(equipe);
    }

    @PutMapping("/updateEquipe")
    Equipe updateEquipe(@RequestBody Equipe equipe) {
        return equipeService.addOrUpdateEquipe(equipe);
    }

    @DeleteMapping("/deleteEquipe/{idEquipe}")
    void deleteEquipe(@PathVariable Long idEquipe) {
        equipeService.deleteEquipe(idEquipe);
    }

    @GetMapping("/findAllProject")
    List<Equipe> findAllProject() {
        return equipeService.findAllEquipes();
    }

    @GetMapping("/findById/{idEquipe}")
    Equipe findEquipeById(@PathVariable Long idEquipe) {
        return equipeService.findEquipeById(idEquipe);
    }
}
