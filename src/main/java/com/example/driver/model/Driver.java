package com.example.driver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Driver {

    private int id;
    private String firstName;
    private String lastName;
    private final List<Car> cars = new ArrayList<>();

    public void addCar(Optional<Car> carOpt) {
        carOpt.ifPresent(cars::add);
    }
}
