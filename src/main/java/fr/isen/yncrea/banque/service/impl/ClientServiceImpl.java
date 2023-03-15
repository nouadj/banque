package fr.isen.yncrea.banque.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.isen.yncrea.banque.data.entity.ClientEntity;
import fr.isen.yncrea.banque.data.repository.ClientRepository;
import fr.isen.yncrea.banque.model.dto.ClientDTO;
import fr.isen.yncrea.banque.service.ClientService;

/**
 *
 * @author noureddine.adjou
 *
 */
@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public List<ClientDTO> getListeClient() {
		return this.clientRepository.findAll().stream().map(ClientDTO::new).collect(Collectors.toList());
	}

	@Override
	public void ajouterClient(ClientDTO client) {
		this.clientRepository.save(client.toEntity());
	}

}
