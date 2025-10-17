package tn.esprit.tpprojet.services;

import tn.esprit.tpprojet.entites.Projet;

import java.util.List;

public interface IProjetService {
    Projet addOrUpdateProjet(Projet projet);

    Projet findProjetById(Long id);

    List<Projet> findALLProjet();

    void deleteProjetById(Long id);
}
