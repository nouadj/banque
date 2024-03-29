package fr.isen.yncrea.banque.model.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import fr.isen.yncrea.banque.data.entity.ClientEntity;

/**
 *
 * @author noureddine.adjou
 *
 */
public class ClientDTO implements Serializable {

	private Integer id;
	private String nom;
	private String prenom;
	private String adresse;
	private List<CompteDTO> comptes;

	public ClientDTO() {
		super();
	}
	public ClientDTO(final ClientEntity clientEntity) {
		this.id = clientEntity.getId();
		this.nom = clientEntity.getNom();
		this.prenom = clientEntity.getPrenom();
		this.adresse = clientEntity.getAdresse();
		this.comptes=clientEntity.getComptes().stream().map(CompteDTO::new).collect(Collectors.toList());
	}

	public ClientEntity toEntity(){
		ClientEntity clientEntity = new ClientEntity();
		clientEntity.setId(id);
		clientEntity.setNom(nom);
		clientEntity.setPrenom(prenom);
		clientEntity.setAdresse(adresse);

		clientEntity.setComptes(
				comptes.stream()
						.map(compteDTO -> compteDTO.toEntity(id))
						.collect(Collectors.toList())
		);

		return clientEntity;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(final Integer id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(final String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return this.prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return this.adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(final String adresse) {
		this.adresse = adresse;
	}

	public List<CompteDTO> getComptes() {
		return comptes;
	}

	public void setComptes(List<CompteDTO> comptes) {
		this.comptes = comptes;
	}
}
