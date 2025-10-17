package tn.esprit.tpprojet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpprojet.entites.Projet;
import tn.esprit.tpprojet.services.IProjetService;

import java.util.List;

@RestController
@RequestMapping("/projectcontroller")
public class ProjetController {
    @Autowired
    IProjetService projetService;

    @PostMapping("/addProjet")
    Projet addProjet(@RequestBody Projet projet) {
        return projetService.addOrUpdateProjet(projet);
    }

    @PutMapping("/updateProjet")
    Projet updateProjet(@RequestBody Projet projet) {
        return projetService.addOrUpdateProjet(projet);
    }

    @DeleteMapping("/deleteProjet/{idProject}")
    void deleteProjet(@PathVariable Long id) {
        projetService.deleteProjetById(id);
    }

    @GetMapping("/findAllProject")
    List<Projet> findAllProject() {
        return projetService.findALLProjet();
    }

    @GetMapping("/findById/{idProject}")
    Projet findProjetById(@PathVariable Long id) {
        return projetService.findProjetById(id);
    }

}
