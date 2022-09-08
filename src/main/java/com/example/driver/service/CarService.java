package com.example.driver.service;

import com.example.driver.model.Car;

import java.util.List;

public interface CarService {

    Car getById(String id);

    List<Car> findAll();
}
