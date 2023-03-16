package fr.isen.yncrea.banque.data.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.isen.yncrea.banque.data.entity.ClientEntity;

/**
 *
 * @author noureddine.adjou
 *
 */
@Repository
public interface ClientJpaRepository extends JpaRepository<ClientEntity, Integer> {

}
