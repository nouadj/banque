package fr.isen.yncrea.banque.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import fr.isen.yncrea.banque.data.repository.jpa.CompteJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.isen.yncrea.banque.data.repository.jpa.ClientJpaRepository;
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
	private ClientJpaRepository clientRepository;

	@Autowired
	private CompteJpaRepository compteRepository;
	@Override
	public List<ClientDTO> getListeClient() {
		return clientRepository.findAll().stream().map(ClientDTO::new).collect(Collectors.toList());
	}

	public ClientDTO getClientById(Integer id) {
		ClientDTO clientDTO = this.clientRepository.findById(id).map(ClientDTO::new).get();
		return clientDTO;
	}
	@Override
	public void ajouterClient(ClientDTO client) {
		this.clientRepository.save(client.toEntity());
	}

}
