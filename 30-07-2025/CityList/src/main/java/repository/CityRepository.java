package repository;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CityRepository {

    public List<String> getCities() {
        return Arrays.asList("Delhi", "Mumbai", "Chennai", "Bangalore", "Hyderabad");
    }
}
