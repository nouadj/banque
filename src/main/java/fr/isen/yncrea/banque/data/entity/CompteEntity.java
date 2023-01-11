package fr.isen.yncrea.banque.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author adjoun
 *
 */
@Entity
@Table(name = "COMPTE")
public class CompteEntity {

	@Id
	@Column(name = "id_compte")
	private Integer id;
	@Column(name = "id_client")
	private Integer idClient;
	@Column(name = "solde_compte")
	private String soldeCompte;

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
	 * @return the idClient
	 */
	public Integer getIdClient() {
		return this.idClient;
	}

	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(final Integer idClient) {
		this.idClient = idClient;
	}

	/**
	 * @return the soldeCompte
	 */
	public String getSoldeCompte() {
		return this.soldeCompte;
	}

	/**
	 * @param soldeCompte the soldeCompte to set
	 */
	public void setSoldeCompte(final String soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

}
