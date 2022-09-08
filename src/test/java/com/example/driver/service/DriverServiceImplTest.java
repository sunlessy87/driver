package com.example.driver.service;

import com.example.driver.model.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;


@SpringBootTest
class DriverServiceImplTest {

    @Autowired
    private DriverService service;

    @Test
    void getById() {
        Driver driver = service.getById(3);
        Assertions.assertEquals(3, driver.getId());
    }

    @Test
    void findAll() {
        Collection<Driver> list = service.findAll();
        Assertions.assertFalse(list.isEmpty());
    }
}
