package tn.esprit.tpprojet.services;

import tn.esprit.tpprojet.entites.ProjetDetail;

import java.util.List;

public interface IProjetDetail {
    ProjetDetail addOrUpdateProjetDetail(ProjetDetail projetDetail);
    ProjetDetail findProjetDetailById(Long id);
    List<ProjetDetail> findAllProjetDetail();
    void deleteProjetDetailById(Long id);
}
