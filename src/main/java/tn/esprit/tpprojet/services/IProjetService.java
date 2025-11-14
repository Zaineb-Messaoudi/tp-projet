package tn.esprit.tpprojet.services;

import tn.esprit.tpprojet.DTO.ProjetDTO;
import tn.esprit.tpprojet.entites.Equipe;
import tn.esprit.tpprojet.entites.Projet;

import java.util.List;

public interface IProjetService {
    Projet addOrUpdateProjet(Projet projet);

    Projet findProjetById(Long id);

    ProjetDTO getProjet(Long id);

    List<Projet> findALLProjet();

    void deleteProjetById(Long id);

    void assignProjetDetailToProjet(Long projetId, Long projetDetailId);

    Equipe assignProjetToEquipe(Long equipeId, List<Long> idProjet);

    Projet addProjectandAssignProjetDetails(Projet projet, Long projetDetailId);
    }
