package fr.isen.yncrea.banque.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author noureddine.adjou
 *
 */
@Entity
@Table(name = "COMPTE")
public class CompteEntity implements Serializable {

	@Id
	@Column(name = "id_compte")
	private Integer id;
	@Column(name = "id_client")
	private Integer idClient;
	@Column(name = "solde_compte")
	private String solde;

	@Column(name = "type_compte")
	private String type;
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
	public String getSolde() {
		return this.solde;
	}

	/**
	 * @param solde the soldeCompte to set
	 */
	public void setSolde(final String solde) {
		this.solde = solde;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
