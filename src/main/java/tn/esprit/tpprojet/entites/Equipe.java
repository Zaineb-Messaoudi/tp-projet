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
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEquipe;
    String nom;
    @Enumerated(EnumType.STRING)
    Domaine domain;

    @ManyToMany
    Set<Projet>projets;

    @ManyToOne
    Entreprise entreprise;
}
