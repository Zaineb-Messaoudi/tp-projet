package tn.esprit.tpprojet.entites;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

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
    LocalDate datedebut;

    @OneToOne(mappedBy = "projetD")
            @JsonIgnore
            @ToString.Exclude
    Projet projet;
}