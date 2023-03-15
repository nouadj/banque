package fr.isen.yncrea.banque.model.dto;

import fr.isen.yncrea.banque.data.entity.ClientEntity;
import fr.isen.yncrea.banque.data.entity.CompteEntity;

import java.io.Serializable;

/**
 *
 */
public class CompteDTO implements Serializable {
    private Integer id;
    private String solde;
    private String type;

    public CompteDTO(final CompteEntity compteEntity) {
        this.id = compteEntity.getId();
        this.solde = compteEntity.getSoldeCompte();
        this.type = compteEntity.getTypeCompte();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSolde() {
        return solde;
    }

    public void setSolde(String solde) {
        this.solde = solde;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
