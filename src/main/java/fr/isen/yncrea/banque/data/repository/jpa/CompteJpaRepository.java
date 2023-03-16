package fr.isen.yncrea.banque.data.repository.jpa;

import fr.isen.yncrea.banque.data.entity.CompteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author noureddine.adjou
 *
 */
@Repository
public interface CompteJpaRepository extends JpaRepository<CompteEntity, Integer> {

}
