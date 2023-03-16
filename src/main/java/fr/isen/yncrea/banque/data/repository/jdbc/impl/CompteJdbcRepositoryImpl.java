package fr.isen.yncrea.banque.data.repository.jdbc.impl;

import fr.isen.yncrea.banque.data.repository.jdbc.CompteJdbcRepository;
import fr.isen.yncrea.banque.data.repository.jdbc.rowmapper.CompteRowMapper;
import fr.isen.yncrea.banque.model.dto.CompteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CompteJdbcRepositoryImpl implements CompteJdbcRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<CompteDTO> getAllComptes() {

        String sql = "SELECT * FROM compte ";
        List<CompteDTO> comptes = jdbcTemplate.query(sql, new CompteRowMapper());
        return comptes;

    }
}
