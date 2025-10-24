package tn.esprit.tpprojet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpprojet.entites.Entreprise;
import tn.esprit.tpprojet.services.EntrepriseServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/entreprisecontroller")
public class EntrepriseController {

    @Autowired
    EntrepriseServiceImpl entrepriseService;

    @PostMapping("/addEntreprise")
    public Entreprise addEntreprise(@RequestBody Entreprise entreprise) {
        return entrepriseService.addOrUpdateEntreprise(entreprise);
    }

    @GetMapping("/getbyidEntreprise/{idEntrepride}")
    public Entreprise getEntrepriseById(@PathVariable Long idEntrepride) {
       return entrepriseService.findEntrepriseById(idEntrepride);
    }
    @PutMapping("/updateEntreprise")
    public Entreprise updateEntreprise(@RequestBody Entreprise entreprise) {
       return entrepriseService.addOrUpdateEntreprise(entreprise);
    }
    @GetMapping("/getallEntreprise")
    public List<Entreprise> getAllEntreprise() {
        return entrepriseService.findAllEntreprise();
    }
    @DeleteMapping("/deleteEntreprise/{idEnntreprise}")
    public void deleteEntreprise(@PathVariable Long idEnntreprise) {
        entrepriseService.deleteEntreprise(idEnntreprise);
    }
}
