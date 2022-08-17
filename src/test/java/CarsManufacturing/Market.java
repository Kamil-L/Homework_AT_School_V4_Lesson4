package CarsManufacturing;

import CarsManufacturing.Country;

import java.util.List;

public class Market {
    public String name;
    public List<Country> countries;

    public Market(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;

    }

    public List<Country> getCountries() {
        return countries;
    }
}
