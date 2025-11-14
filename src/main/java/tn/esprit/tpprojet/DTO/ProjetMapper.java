package tn.esprit.tpprojet.DTO;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tn.esprit.tpprojet.entites.Projet;

@Mapper(componentModel = "spring")
public interface ProjetMapper {

    @Mapping(target = "libelleProjet", source = "sujet")
    ProjetDTO toDTO(Projet projet);
}
