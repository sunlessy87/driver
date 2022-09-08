package com.example.driver.repository;

import com.example.driver.model.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CarDAOImpl implements CarDAO {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Car getCarByID(String id) {
        return null;
    }

    @Override
    public List<Car> getAllCars() {
        return Collections.emptyList();
    }
}
