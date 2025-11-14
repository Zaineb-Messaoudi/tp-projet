package tn.esprit.tpprojet.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpprojet.DTO.ProjetDTO;
import tn.esprit.tpprojet.DTO.ProjetMapper;
import tn.esprit.tpprojet.entites.Equipe;
import tn.esprit.tpprojet.entites.Projet;
import tn.esprit.tpprojet.entites.ProjetDetail;
import tn.esprit.tpprojet.repositories.EquipeRepository;
import tn.esprit.tpprojet.repositories.ProjetDetailRepository;
import tn.esprit.tpprojet.repositories.ProjetRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements IProjetService{

    ProjetRepository projetRepository;

    ProjetDetailRepository projetDetailRepository;

    EquipeRepository equipeRepository;

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
    public void assignProjetDetailToProjet(Long projetId, Long projetDetailId) {
        Projet projet = projetRepository.findById(projetId).get();
        ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).get();
        projet.setProjetD(projetDetail);
        projetRepository.save(projet);

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

    public Equipe assignProjetToEquipe(Long equipeId, List<Long> idProjet) {
        Equipe equipe = equipeRepository.findById(equipeId).get();
        List<Projet> projet = projetRepository.findAll();
        equipe.getProjets().addAll(projet);
        return equipeRepository.save(equipe);
    }

    @Override
    public Projet addProjectandAssignProjetDetails(Projet projet, Long projetDetailId) {
        ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).get();
        projet.setProjetD(projetDetail);
        return projetRepository.save(projet);
    }


}