package fr.isen.yncrea.banque.data.repository;

import fr.isen.yncrea.banque.data.entity.ClientEntity;
import fr.isen.yncrea.banque.data.entity.CompteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author noureddine.adjou
 *
 */
@Repository
public interface CompteRepository extends JpaRepository<CompteEntity, Integer> {

}
