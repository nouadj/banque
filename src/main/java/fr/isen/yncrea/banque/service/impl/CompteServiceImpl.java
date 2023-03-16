package fr.isen.yncrea.banque.service.impl;

import fr.isen.yncrea.banque.data.repository.CompteRepository;
import fr.isen.yncrea.banque.model.dto.CompteDTO;
import fr.isen.yncrea.banque.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author noureddine.adjou
 *
 */
@Service
public class CompteServiceImpl implements CompteService {

	@Autowired
	private CompteRepository compteRepository;

	@Override
	public List<CompteDTO> getListeCompte() {
		return this.compteRepository.findAll().stream().map(CompteDTO::new).collect(Collectors.toList());
	}

	@Override
	public void ajouterCompte(CompteDTO compte, Integer clientId) {
		compteRepository.save(compte.toEntity(clientId));
	}

	@Override
	public void supprimerCompte(Integer compteId) {
		 compteRepository.deleteById(compteId);
	}

	@Override
	public void modifierCompte(Integer compteId, CompteDTO compte) {
		if(compteRepository.findById(compteId)!=null){
			//
		}

	}

}
