package tn.esprit.tpprojet.entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idProjet;
    public String sujet;

    @OneToOne(cascade = CascadeType.ALL)
    ProjetDetail projetD;
    @ManyToMany(mappedBy = "projets")
    Set<Equipe> equipes;
}