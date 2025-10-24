package tn.esprit.tpprojet.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpprojet.entites.Entreprise;
import tn.esprit.tpprojet.repositories.EntrepriseRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EntrepriseServiceImpl implements IEntreprise {

    EntrepriseRepository entrepriseRepository;

    @Override
    public Entreprise findEntrepriseById(Long id) {
        return entrepriseRepository.findById(id).get();
    }

    @Override
    public List<Entreprise> findAllEntreprise() {
        return entrepriseRepository.findAll();
    }

    @Override
    public Entreprise addOrUpdateEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public void deleteEntreprise(Long id) {
        entrepriseRepository.deleteById(id);
    }
}
