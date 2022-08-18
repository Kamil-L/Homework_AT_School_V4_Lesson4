package CarsManufacturing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Car {
    private final Manufacturer manufacturer;
    private final boolean isAutomaticGear;
    private final Market market;
    private final String segment;
    private final ArrayList<Dimension> dimensions;

    public Car(Manufacturer manufacturer, boolean isAutomaticGear, Market market, Segment segment,
               ArrayList<Dimension> dimensions) {
        this.manufacturer = manufacturer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = String.valueOf(segment);
        this.dimensions = dimensions;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public ArrayList<Dimension> getDimensions() {
        return dimensions;
    }

    public static void printCarsData(List<Car> cars) {
        if (cars.isEmpty()) {
            System.out.println("\nThere is no any filtered data");
        }
        for (Object car : cars) {
            System.out.println(car);
        }
    }

    @Override
    public String toString() {
        return "Filtered market values: " + getMarket().getCountries()
                .stream()
                .map(country -> country.countryName() + "-" + country.countrySign()).toList();
    }

    public static List<Car> newCarFiltration(ArrayList<Car> newCars, int trunkCap, String carProd) {
        var isManufacturerRequired = (Predicate<Car>) mf -> mf.getManufacturer().getModel().equals(carProd);
        var isTrunkCapRequired = (Predicate<Car>) d -> d.getDimensions().stream().anyMatch(t -> t.getTrunkCapacity() > trunkCap);
        return newCars.stream()
                .filter(isManufacturerRequired)
                .filter(Car::isAutomaticGear)
                .filter(isTrunkCapRequired)
                .collect(Collectors.toList());
    }
}