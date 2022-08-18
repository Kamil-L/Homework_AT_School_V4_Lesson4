package CarsManufacturing;

import java.util.ArrayList;

public class RunTest {
    public static void main(String[] args) {
        ArrayList<Car> cars = Factory.madeObjects();
        Car.printCarsData(Car.newCarFiltration(cars,
                299,
                "BMW"));
    }
}