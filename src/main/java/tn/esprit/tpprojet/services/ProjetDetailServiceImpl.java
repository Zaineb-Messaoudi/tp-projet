package tn.esprit.tpprojet.services;

import org.springframework.stereotype.Service;
import tn.esprit.tpprojet.entites.ProjetDetail;
import tn.esprit.tpprojet.repositories.ProjetDetailRepository;

import java.util.List;

@Service
public class ProjetDetailServiceImpl implements IProjetDetail{

    ProjetDetailRepository projetDetailRepository;
    @Override
    public ProjetDetail addOrUpdateProjetDetail(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public ProjetDetail findProjetDetailById(Long id) {
        return projetDetailRepository.findById(id).get();
    }

    @Override
    public List<ProjetDetail> findAllProjetDetail() {
        return projetDetailRepository.findAll();
    }

    @Override
    public void deleteProjetDetailById(Long id) {
        projetDetailRepository.deleteById(id);
    }
}
