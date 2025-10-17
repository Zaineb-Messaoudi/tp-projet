package tn.esprit.tpprojet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpprojet.entites.Entreprise;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
}
