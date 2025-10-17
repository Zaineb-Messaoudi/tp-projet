package tn.esprit.tpprojet.entites;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjetDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idProjetDetail;
    String description;
    String technologie;
    long cout;
    Date datedebut;

    @OneToOne(mappedBy = "projetD")
    Projet projet;
}