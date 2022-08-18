package CarsManufacturing;

public class Country {
    private final String countryName;
    private final char countrySign;

    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }

    public String countryName() {
        return countryName;
    }

    public String countrySign() {
        return String.valueOf(countrySign);
    }
}