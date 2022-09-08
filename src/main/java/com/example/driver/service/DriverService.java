package com.example.driver.service;

import com.example.driver.model.Driver;

import java.util.Collection;

public interface DriverService {

    Driver getById(int id);

    Collection<Driver> findAll();
}
