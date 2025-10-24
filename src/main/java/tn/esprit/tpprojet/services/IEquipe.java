package tn.esprit.tpprojet.services;

import tn.esprit.tpprojet.entites.Equipe;
import tn.esprit.tpprojet.entites.Projet;

import java.util.List;

public interface IEquipe {
    Equipe findEquipeById(Long id);
    List<Equipe> findAllEquipes();
    Equipe addOrUpdateEquipe(Equipe equipe);
    void deleteEquipe(Long id);
}
