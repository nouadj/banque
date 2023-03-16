package fr.isen.yncrea.banque.data.repository.jdbc.rowmapper;

import fr.isen.yncrea.banque.model.dto.CompteDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CompteRowMapper implements RowMapper<CompteDTO> {
    @Override
    public CompteDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        CompteDTO compteDTO = new CompteDTO();
        compteDTO.setId(rs.getInt("id_compte"));
        compteDTO.setSolde(rs.getString("solde_compte"));
        compteDTO.setType(rs.getString("type_compte"));
        // autres attributs
        return compteDTO;
    }
}
