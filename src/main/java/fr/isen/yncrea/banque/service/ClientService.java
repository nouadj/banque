package fr.isen.yncrea.banque.service;

import java.util.List;

import fr.isen.yncrea.banque.model.dto.ClientDTO;

/**
 *
 * @author noureddine.adjou
 *
 */
public interface ClientService {

	List<ClientDTO> getListeClient();

	void ajouterClient(ClientDTO client);

	ClientDTO getClientById( Integer id);
}
