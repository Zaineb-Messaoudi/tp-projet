package tn.esprit.tpprojet.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEntreprise;
    String nomEntreprise;
    String Adresse;

    @OneToMany(mappedBy = "entreprise")
    Set<Equipe> equipes ;
}