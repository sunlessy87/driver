package com.example.driver.repository;

import com.example.driver.model.Car;

import java.util.List;

public interface CarDAO {

    Car getCarByID(String id);

    List<Car> getAllCars();
}
