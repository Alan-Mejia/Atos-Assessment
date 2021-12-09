package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "languages")
public class Language{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //@Column (name="id_language") //notation to refer the real name of the column
    @ManyToOne
    @JoinColumn(name = "id_language", referencedColumnName = "id_language")
    private Country countries;

    @Column
    private String name;


    public Language(Integer id, Country countries, String name) {
        this.id = id;
        this.countries = countries;
        this.name = name;
    }

    public Language(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Country getCountries() {
        return countries;
    }

    public void setCountries(Country countries) {
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Language{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
