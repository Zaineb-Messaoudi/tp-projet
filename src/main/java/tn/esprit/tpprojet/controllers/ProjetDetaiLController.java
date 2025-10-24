package tn.esprit.tpprojet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpprojet.entites.ProjetDetail;
import tn.esprit.tpprojet.services.IProjetDetail;

import java.util.List;

@RestController
@RequestMapping("/projectdetailcontroller")
public class ProjetDetaiLController {
    @Autowired
    IProjetDetail projetdetailService;

    @PostMapping("/addProjetDetail")
    ProjetDetail addProjetDetail(@RequestBody ProjetDetail projetdetail) {
        return projetdetailService.addOrUpdateProjetDetail(projetdetail);
    }

    @PutMapping("/updateProjetDetail")
    ProjetDetail updateProjetDetail(@RequestBody ProjetDetail projetdetail) {
        return projetdetailService.addOrUpdateProjetDetail(projetdetail);
    }

    @DeleteMapping("/deleteProjetDetail/{idProject}")
    void deleteProjetDetail(@PathVariable Long id) {
        projetdetailService.deleteProjetDetailById(id);
    }

    @GetMapping("/findAllProject")
    List<ProjetDetail> findAllProject() {
        return projetdetailService.findAllProjetDetail();
    }

    @GetMapping("/findById/{idProject}")
    ProjetDetail findProjetDetailById(@PathVariable Long id) {
        return projetdetailService.findProjetDetailById(id);
    }
}
