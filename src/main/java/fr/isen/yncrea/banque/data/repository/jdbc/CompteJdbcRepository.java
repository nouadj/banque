package fr.isen.yncrea.banque.data.repository.jdbc;

import fr.isen.yncrea.banque.model.dto.CompteDTO;

import java.util.List;

public interface CompteJdbcRepository {
    public List<CompteDTO> getAllComptes();
}
