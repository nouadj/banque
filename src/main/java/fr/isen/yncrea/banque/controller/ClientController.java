package fr.isen.yncrea.banque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.isen.yncrea.banque.model.dto.ClientDTO;
import fr.isen.yncrea.banque.service.ClientService;

/**
 *
 * @author adjoun
 *
 */
@RestController
public class ClientController {

	@Autowired
	private ClientService clientService;

	@RequestMapping("/")
	public String hello() {
		return "Bonjour et bienvenue à la GL-Banque";
	}

	/**
	 * Liste des clients
	 */
	@RequestMapping("/clients")
	List<ClientDTO> clientIndex() {
		return this.clientService.getListeClient();
	}
	// Trouver un client avec son Id

	// Liste des compte d'un client

	// Trouver un compte avec son Id

	// Trouver un compte avec l'id de client et son Id

	// Créer un client

	// Créer un compte

	// Modifier les information d'un Client

	// Débiter un Compte

	// Créditer un Compte
}
