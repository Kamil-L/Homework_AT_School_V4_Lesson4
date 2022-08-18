package CarsManufacturing;

import java.util.List;

public class Market {
    private final String name;
    private final List<Country> countries;

    public Market(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;

    }

    public List<Country> getCountries() {
        return countries;
    }
}
