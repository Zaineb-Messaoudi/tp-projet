package tn.esprit.tpprojet.services;

import tn.esprit.tpprojet.entites.Entreprise;

import java.util.List;

public interface IEntreprise {
    Entreprise findEntrepriseById(Long id);
    List<Entreprise> findAllEntreprise();
    Entreprise addOrUpdateEntreprise(Entreprise entreprise);
    void deleteEntreprise(Long id);
}
