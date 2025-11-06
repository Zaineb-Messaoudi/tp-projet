package tn.esprit.tpprojet.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpprojet.DTO.ProjetDTO;
import tn.esprit.tpprojet.DTO.ProjetMapper;
import tn.esprit.tpprojet.entites.Projet;
import tn.esprit.tpprojet.repositories.ProjetRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements IProjetService{

    ProjetRepository projetRepository;

    ProjetMapper mapper;

    @Override
    public Projet addOrUpdateProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public void deleteProjetById(Long id) {
        projetRepository.deleteById(id);
    }

    @Override
    public Projet findProjetById(Long id) {
        return projetRepository.findById(id).get();
    }

    @Override
    public ProjetDTO getProjet(Long id) {
        Projet projet = projetRepository.findById(id).orElse(null);
        return mapper.toDTO(projet);
    }


    @Override
    public List<Projet> findALLProjet() {
        return projetRepository.findAll();
    }

}