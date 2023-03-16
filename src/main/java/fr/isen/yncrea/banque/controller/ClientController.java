package fr.isen.yncrea.banque.controller;

import java.util.List;

import fr.isen.yncrea.banque.data.repository.jdbc.CompteJdbcRepository;
import fr.isen.yncrea.banque.model.dto.CompteDTO;
import fr.isen.yncrea.banque.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fr.isen.yncrea.banque.model.dto.ClientDTO;
import fr.isen.yncrea.banque.service.ClientService;

/**
 *
 * @author noureddine.adjou
 *
 */
@RestController
//Juste pour autoriser l'utilisation d'un front ex Angular
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@Autowired
	private CompteService compteService;


	@GetMapping("/")
	public String hello() {
		return "Bonjour et bienvenue à la Spring-Banque";
	}

	/**
	 * Liste des clients
	 */
	@GetMapping("/clients")
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	List<ClientDTO> getListeClient() {
		return this.clientService.getListeClient();
	}

	@GetMapping("/exception")
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	List<ClientDTO> testErrorHandler() {
		int a = 8/0;
		return this.clientService.getListeClient();
	}
	//Ajouter un client
    @PostMapping("/clients")
    public ResponseEntity<ClientDTO> ajouterClient(@RequestBody ClientDTO client) {
        // Ajouter le client dans la base de données ou faire tout autre traitement
        // Renvoyer une réponse HTTP 201 (Created) avec le client ajouté dans le corps de la réponse
    	this.clientService.ajouterClient(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(client);
    }

	// Trouver un client avec son Id
	@GetMapping("/comptes")
	List<CompteDTO> listeCompte() {
		return this.compteService.getListeCompte();
	}

	@GetMapping("/comptes_jdbc")
	List<CompteDTO> listeCompteJdbc() {
		return this.compteService.getListeCompteJdbc();
	}
	
	//Supprimer un compte
	@DeleteMapping("/comptes/{compte_id}")
	ResponseEntity.BodyBuilder supprimerCompte(@PathVariable("compte_id") Integer compteId) {
		this.compteService.supprimerCompte(compteId);
		return ResponseEntity.status(HttpStatus.OK);
	}

	@PutMapping("/comptes/{compte_id}")
	ResponseEntity<CompteDTO> modifierCompte(@RequestBody CompteDTO compte,@PathVariable("compte_id") Integer compteId) {
		this.compteService.modifierCompte(compteId,compte);
		return ResponseEntity.status(HttpStatus.OK).body(compte);
	}
	// Liste des compte d'un client
	@GetMapping("/clients/{client_id}/comptes")
	ClientDTO trouverListeCompteClient(@PathVariable("client_id") Integer clientId) {
		return	this.clientService.getClientById(clientId);
	}
	// Trouver un compte avec son Id

	// Trouver un compte avec l'id de client et son Id

	// Créer un client

	// Créer un compte
	@PostMapping("/clients/{client_id}/comptes")
	public ResponseEntity<CompteDTO> ajouterCompte(@RequestBody CompteDTO compte, @PathVariable("client_id") Integer clientId) {
		this.compteService.ajouterCompte(compte,clientId);
		return ResponseEntity.status(HttpStatus.CREATED).body(compte);
	}
	// Modifier les information d'un Client

	// Débiter un Compte

	// Créditer un Compte
}
