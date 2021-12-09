package service;

import model.Country;
import java.util.List;

public interface CountryService {
    //CRUD METHOD'S SIGNATURE

    Country getCountry(Integer id);
    Country save(Country country);
    Country update(Country country);
    void delete(Integer id);
    List<Country> getAll();
}
