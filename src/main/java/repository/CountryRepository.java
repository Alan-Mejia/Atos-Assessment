package repository;

import model.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface CountryRepository
    extends CrudRepository<Country, Integer> {
    Optional<Country> findCountryById(Integer id);
}
