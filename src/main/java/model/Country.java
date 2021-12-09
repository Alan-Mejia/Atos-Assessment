package model;

import javax.persistence.*;
import java.util.List;

//Create the entity for table countries
@Entity
@Table (name = "countries")
public class Country {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;
    @Column
    private String capital;
    @Column
    private Integer population;


    @Column (name="id_language") //notation to refer the real name of the column
    @OneToMany (mappedBy = "countries")
    private List<Language> languages;

    public Country(){

    }

    public Country(Integer id, String name, String capital, Integer population, List<Language> languages) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.languages = languages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    @Override
    public String toString(){
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capital='"+ capital + '\'' +
                ", population=" + population +
                ", id_language=" + languages +
                '}';
    }

}
