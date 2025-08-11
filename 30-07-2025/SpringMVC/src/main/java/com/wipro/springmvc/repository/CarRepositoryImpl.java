package com.wipro.springmvc.repository;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class CarRepositoryImpl implements CarRepository {
    public List<String> getAllCars() {
        return Arrays.asList("Audi", "Mercedes", "BMW");
    }
}
