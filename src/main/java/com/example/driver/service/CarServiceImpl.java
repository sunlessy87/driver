package com.example.driver.service;

import com.example.driver.model.Car;
import com.example.driver.repository.CarDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarDAO dao;

    @Override
    public Car getById(String id) {
        return dao.getCarByID(id);
    }

    @Override
    public List<Car> findAll() {
        return dao.getAllCars();
    }
}
