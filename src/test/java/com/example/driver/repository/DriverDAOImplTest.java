package com.example.driver.repository;

import com.example.driver.model.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;

@SpringBootTest
class DriverDAOImplTest {

    @Autowired
    private DriverDAO dao;

    @Test
    void getDriverById() {
        Driver driver = dao.getDriverById(2);
        Assertions.assertEquals(2, driver.getId());
    }

    @Test
    void getAllDrivers() {
        Collection<Driver> list = dao.getAllDrivers();
        Assertions.assertFalse(list.isEmpty());
    }

}
