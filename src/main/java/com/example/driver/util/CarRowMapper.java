package com.example.driver.util;

import com.example.driver.model.Car;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CarRowMapper {

    public static Optional<Car> mapToCar(final SqlRowSet rowSet) {
        return Optional.ofNullable(rowSet.getObject("car_id"))
                       .map(carId -> Car.builder()
                                        .id((Integer) carId)
                                        .model(rowSet.getString("model"))
                                        .number(rowSet.getString("number"))
                                        .build());
    }

}
