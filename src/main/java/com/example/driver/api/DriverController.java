package com.example.driver.api;

import com.example.driver.model.Driver;
import com.example.driver.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/drivers")
@RequiredArgsConstructor
class DriverController {

    private final DriverService service;

    @GetMapping()
    Collection<Driver> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    Driver getById(@PathVariable int id) {
        return service.getById(id);
    }
}
