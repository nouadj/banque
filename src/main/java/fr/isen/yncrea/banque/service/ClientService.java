package fr.isen.yncrea.banque.service;

import java.util.List;

import fr.isen.yncrea.banque.model.dto.ClientDTO;

/**
 *
 * @author adjoun
 *
 */
public interface ClientService {

	List<ClientDTO> getListeClient();
}
