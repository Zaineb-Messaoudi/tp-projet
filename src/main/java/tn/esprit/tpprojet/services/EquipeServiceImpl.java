package tn.esprit.tpprojet.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpprojet.entites.Equipe;
import tn.esprit.tpprojet.repositories.EquipeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipeServiceImpl implements IEquipe{
    EquipeRepository equipeRepository;
    @Override
    public Equipe findEquipeById(Long id) {
        return equipeRepository.findById(id).get();
    }

    @Override
    public List<Equipe> findAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe addOrUpdateEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public void deleteEquipe(Long id) {
        equipeRepository.deleteById(id);
    }
}
