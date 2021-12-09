package service;

import model.Country;
import org.springframework.stereotype.Service;
import repository.CountryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl
    implements CountryService{

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country getCountry(Integer id) {
        Optional<Country> country = countryRepository.findCountryById(id);
        return country.orElse(null);
    }

    @Override
    public Country save(Country country) {
        return null;
    }

    @Override
    public Country update(Country country) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Country> getAll() {
        List<Country> countries = new ArrayList<>();
        countryRepository.findAll().forEach(country -> {
            if(country.getLanguages() != null){
                Country info = new Country();
                info.setId(country.getId());
                //info.getLanguages(country.getLanguages());
                countries.add(info);
            }
        });

        return countries;
    }
}


