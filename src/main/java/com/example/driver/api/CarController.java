package com.example.driver.api;

import com.example.driver.model.Car;
import com.example.driver.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
class CarController {

    private final CarService service;

    @GetMapping
    List<Car> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    Car getById(@PathVariable String id) {
        return service.getById(id);
    }
}
