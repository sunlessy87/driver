package com.example.driver.util;

import com.example.driver.model.Driver;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DriverRowMapper {

    public static Map<Integer, Driver> mapToDriver(final SqlRowSet rowSet) {

        Map<Integer, Driver> map = new HashMap<>();

        while (rowSet.next()) {
            Optional.of(rowSet.getInt("driver_id"))
                    .ifPresent(driverId -> map.compute(driverId, (key, value) -> {
                        if (map.containsKey(key)) {
                            if (value != null) {
                                value.addCar(CarRowMapper.mapToCar(rowSet));
                            }
                        } else {
                            value = Driver.builder()
                                          .id(rowSet.getInt("driver_id"))
                                          .firstName(rowSet.getString("first_name"))
                                          .lastName(rowSet.getString("last_name"))
                                          .build();
                            value.addCar(CarRowMapper.mapToCar(rowSet));
                        }
                        return value;
                    }));
        }
        return map;
    }

}
