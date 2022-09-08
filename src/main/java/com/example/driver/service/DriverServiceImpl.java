package com.example.driver.service;

import com.example.driver.model.Driver;
import com.example.driver.repository.DriverDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {

    private final DriverDAO dao;

    @Override
    public Driver getById(int id) {
        return dao.getDriverById(id);
    }

    @Override
    public Collection<Driver> findAll() {
        return dao.getAllDrivers();
    }
}
