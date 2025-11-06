package tn.esprit.tpprojet.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjetDetailDTO {
    public String description;
    public String technologie;
    public String dateDebut;
}
