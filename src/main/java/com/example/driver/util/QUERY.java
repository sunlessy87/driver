package com.example.driver.util;

public enum QUERY {

    BY_ID("SELECT * FROM drivers LEFT JOIN cars ON drivers.driver_id=cars.driver_id WHERE drivers.driver_id=?"),
    ALL("SELECT * FROM drivers LEFT JOIN cars ON drivers.driver_id=cars.driver_id ");

    private final String value;

    QUERY(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
