package fr.isen.yncrea.banque.service;

import fr.isen.yncrea.banque.model.dto.ClientDTO;
import fr.isen.yncrea.banque.model.dto.CompteDTO;

import java.util.List;

/**
 *
 * @author noureddine.adjou
 *
 */
public interface CompteService {

	List<CompteDTO> getListeCompte();

	void ajouterCompte(CompteDTO compte, Integer clientId);

	void supprimerCompte(Integer compteId);

	void modifierCompte(Integer compteId, CompteDTO compte);
}
