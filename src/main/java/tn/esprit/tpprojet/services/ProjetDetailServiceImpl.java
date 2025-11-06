package tn.esprit.tpprojet.services;

import org.springframework.stereotype.Service;
import tn.esprit.tpprojet.DTO.ProjetDetailDTO;
import tn.esprit.tpprojet.entites.ProjetDetail;
import tn.esprit.tpprojet.repositories.ProjetDetailRepository;

import java.time.format.DateTimeFormatter;
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

    @Override
    public ProjetDetailDTO getDetailsProjet(Long id) {
        ProjetDetail detail = projetDetailRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Détails du projet non trouvés"));

        return convertToDTO(detail);
    }

    @Override
    public ProjetDetailDTO convertToDTO(ProjetDetail detail) {
        ProjetDetailDTO dto = new ProjetDetailDTO();
        dto.setDescription(detail.getDescription());
        dto.setTechnologie(detail.getTechnologie());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dto.setDateDebut(detail.getDatedebut().format(formatter));

        return dto;
    }
}
