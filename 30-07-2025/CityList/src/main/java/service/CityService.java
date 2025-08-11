package service;

import repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepo;

    public List<String> getAllCities() {
        return cityRepo.getCities();
    }
}
