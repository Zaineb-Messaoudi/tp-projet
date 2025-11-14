package tn.esprit.tpprojet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpprojet.DTO.ProjetDTO;
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
    void deleteProjet(@PathVariable Long idProject) {
        projetService.deleteProjetById(idProject);
    }

    @GetMapping("/findAllProject")
    List<Projet> findAllProject() {
        return projetService.findALLProjet();
    }

    @GetMapping("/findById/{idProject}")
    Projet findProjetById(@PathVariable Long idProject) {
        return projetService.findProjetById(idProject);
    }

    @GetMapping("/{idProject}")
    ProjetDTO getProjet(@PathVariable Long idProject) {return projetService.getProjet(idProject);}

    @PutMapping("/affecter-projet-a-projet-details/{IdProjet}/{IdProjetD}")
    public void affecgterProjetAProjetDetail(@PathVariable("IdProjet") Long proejtId,
                                             @PathVariable("IdProjetD") Long proejtDetailsId) {
        projetService.assignProjetDetailToProjet(proejtId, proejtDetailsId);
    }

    @PutMapping("/affecter-projet-equipe/{IdEquipe}")
    public void assignProjetToEquipe(@PathVariable("IdEquipe") Long equipeId, @RequestParam List<Long> idProject) {
        projetService.assignProjetToEquipe(equipeId, idProject);
    }

    @PostMapping("/addProjetandassignProjetDetail/{idProjetD}")
    public Projet addProjetandassignProjetDetail(@RequestBody Projet projet,
                                                 @PathVariable("idProjetD") Long projetDetailId) {
        return projetService.addProjectandAssignProjetDetails(projet, projetDetailId);
    }

}
