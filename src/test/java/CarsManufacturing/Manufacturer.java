package CarsManufacturing;

public class Manufacturer {
    private final String model;
    private final String type;

    public Manufacturer(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }
}