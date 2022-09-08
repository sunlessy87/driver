package com.example.driver.repository;

import com.example.driver.model.Driver;

import java.util.Collection;

public interface DriverDAO {

    Driver getDriverById(int id);

    Collection<Driver> getAllDrivers();
}
