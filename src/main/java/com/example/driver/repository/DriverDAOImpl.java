package com.example.driver.repository;

import com.example.driver.model.Driver;
import com.example.driver.util.DriverRowMapper;
import com.example.driver.util.QUERY;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class DriverDAOImpl implements DriverDAO {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Driver getDriverById(int id) {
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(QUERY.BY_ID.getValue(), id);
        return Optional.ofNullable(DriverRowMapper.mapToDriver(rowSet).get(id))
                       .orElseThrow(() -> new RuntimeException(String.format("Driver with ID=%d not found", id)));
    }

    @Override
    public Collection<Driver> getAllDrivers() {
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(QUERY.ALL.getValue());
        return DriverRowMapper.mapToDriver(rowSet).values();
    }
}

