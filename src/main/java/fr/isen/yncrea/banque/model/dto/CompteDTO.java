package fr.isen.yncrea.banque.model.dto;

import fr.isen.yncrea.banque.data.entity.CompteEntity;

import java.io.Serializable;

/**
 *
 */
public class CompteDTO implements Serializable {
    private Integer id;
    private String solde;
    private String type;

    public CompteDTO() {
        super();
    }

    public CompteDTO(final CompteEntity compteEntity) {
        this.id = compteEntity.getId();
        this.solde = compteEntity.getSolde();
        this.type = compteEntity.getType();
    }

    public CompteEntity toEntity(Integer idClient){
        CompteEntity entity = new CompteEntity();
        entity.setId(this.id);
        entity.setSolde(this.solde);
        entity.setType(this.type);
        return entity;
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

    @Override
    public String toString() {
        return "CompteDTO{" +
                "id=" + id +
                ", solde='" + solde + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
