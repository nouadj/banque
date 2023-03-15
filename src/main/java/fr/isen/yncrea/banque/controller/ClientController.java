package fr.isen.yncrea.banque.controller;

import java.util.List;

import fr.isen.yncrea.banque.model.dto.CompteDTO;
import fr.isen.yncrea.banque.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fr.isen.yncrea.banque.model.dto.ClientDTO;
import fr.isen.yncrea.banque.service.ClientService;

/**
 *
 * @author noureddine.adjou
 *
 */
@RestController
//Juste pour autoriser un front ex Angular
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@Autowired
	private CompteService compteService;

	@RequestMapping("/")
	public String hello() {
		return "Bonjour et bienvenue à la Spring-Banque";
	}

	/**
	 * Liste des clients
	 */
	@RequestMapping("/clients")
	List<ClientDTO> clientIndex() {
		return this.clientService.getListeClient();
	}
	
	//Ajouter un client
    @PostMapping("/client")
    public ResponseEntity<ClientDTO> ajouterClient(@RequestBody ClientDTO client) {
        // Ajouter le client dans la base de données ou faire tout autre traitement
        // Renvoyer une réponse HTTP 201 (Created) avec le client ajouté dans le corps de la réponse
    	this.clientService.ajouterClient(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(client);
    }
    
	// Trouver un client avec son Id
	@RequestMapping("/comptes")
	List<CompteDTO> compteIndex() {
		return this.compteService.getListeCompte();
	}
	

	// Liste des compte d'un client

	// Trouver un compte avec son Id

	// Trouver un compte avec l'id de client et son Id

	// Créer un client

	// Créer un compte

	// Modifier les information d'un Client

	// Débiter un Compte

	// Créditer un Compte
}
