package fr.isen.yncrea.banque.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.isen.yncrea.banque.data.repository.ClientRepository;
import fr.isen.yncrea.banque.model.dto.ClientDTO;
import fr.isen.yncrea.banque.service.ClientService;

/**
 *
 * @author adjoun
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

}
