package controller;

import model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CountryService;

import java.util.List;

@RestController
public class CountryController {

    private CountryService countryService;

    public CountryController(@Autowired CountryService countryService) {
        this.countryService=countryService;
    }

    @GetMapping("country/{id}")
    public Country getCountry(@PathVariable Integer id){
        return countryService.getCountry(id);
    }

    @PostMapping("/country")
    public Country newCountry(@RequestBody Country country){
        return countryService.save(country);
    }

    @PutMapping("/country")
    public Country update(@RequestBody Country country){
        return countryService.update(country);
    }

    @DeleteMapping("/country")
    public void delete(@PathVariable Integer id){
        countryService.delete(id);
    }

    @GetMapping("/country/all")
    public List<Country> getAllCountries(){
        return countryService.getAll();
    }

}
