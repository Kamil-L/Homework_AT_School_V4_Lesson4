package CarsManufacturing;

import java.util.ArrayList;
import java.util.List;

public class RunTest {
    public static void main(String[] args) {
        ArrayList<Car> cars = newCarData();
        Car.printCarsData(Car.newCarFiltration(cars,
                299,
                "BMW"));
    }

    public static ArrayList<Car> newCarData() {
        Manufacturer toyota = new Manufacturer("Toyota", "Corolla");
        Manufacturer kia = new Manufacturer("Kia", "Ceed");
        Manufacturer volvo = new Manufacturer("Volvo", "V60");
        Manufacturer volkswagen = new Manufacturer("Volkswagen", "Golf");
        Manufacturer mercedes = new Manufacturer("Mercedes", "GLS");
        Manufacturer opel = new Manufacturer("Opel", "Astra");
        Manufacturer audi = new Manufacturer("Audi", "Q8");
        Manufacturer suzuki = new Manufacturer("Suzuki", "Vitara");
        Manufacturer renault = new Manufacturer("Renault", "Trafic");
        Manufacturer bmw = new Manufacturer("BMW", "i4");

        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'G');
        Country china = new Country("China", 'C');
        Country netherlands = new Country("Netherlands", 'N');
        Country korea = new Country("Korea", 'K');
        Country italy = new Country("Italy", 'I');
        Country hungary = new Country("Hungary", 'H');
        Country austria = new Country("Austria", 'A');
        Country england = new Country("England", 'E');

        List<Country> businessMarket = new ArrayList<>();
        businessMarket.add(germany);
        businessMarket.add(england);
        businessMarket.add(italy);

        List<Country> cargoMarket = new ArrayList<>();
        cargoMarket.add(germany);
        cargoMarket.add(netherlands);
        cargoMarket.add(austria);

        List<Country> transportMarket = new ArrayList<>();
        transportMarket.add(germany);
        transportMarket.add(china);
        transportMarket.add(hungary);

        List<Country> taxiMarket = new ArrayList<>();
        taxiMarket.add(poland);
        taxiMarket.add(korea);
        taxiMarket.add(italy);

        List<Country> busMarket = new ArrayList<>();
        busMarket.add(netherlands);
        busMarket.add(austria);
        busMarket.add(hungary);

        Market business = new Market("business", businessMarket);
        Market cargo = new Market("cargo", cargoMarket);
        Market transport = new Market("transport", transportMarket);
        Market taxi = new Market("taxi", taxiMarket);
        Market bus = new Market("bus", busMarket);

        Dimension dimTrunkCap250 = new Dimension(110, 160, 250);
        Dimension dimTrunkCap278 = new Dimension(110, 161, 278);
        Dimension dimTrunkCap281 = new Dimension(111, 168, 281);
        Dimension dimTrunkCap290 = new Dimension(112, 172, 290);
        Dimension dimTrunkCap305 = new Dimension(114, 174, 305);
        Dimension dimTrunkCap330 = new Dimension(114, 180, 330);
        Dimension dimTrunkCap345 = new Dimension(115, 182, 345);
        Dimension dimTrunkCap370 = new Dimension(117, 183, 370);
        Dimension dimTrunkCap550 = new Dimension(150, 212, 550);
        Dimension dimTrunkCap680 = new Dimension(170, 235, 680);
        Dimension dimTrunkCap800 = new Dimension(190, 250, 800);
        Dimension dimTrunkCap950 = new Dimension(210, 266, 950);

        ArrayList<Dimension> lowSizeDimCar = new ArrayList<>();
        lowSizeDimCar.add(dimTrunkCap250);
        lowSizeDimCar.add(dimTrunkCap278);
        lowSizeDimCar.add(dimTrunkCap281);
        lowSizeDimCar.add(dimTrunkCap290);
        lowSizeDimCar.add(dimTrunkCap305);

        ArrayList<Dimension> medSizeDimCar = new ArrayList<>();
        medSizeDimCar.add(dimTrunkCap330);
        medSizeDimCar.add(dimTrunkCap345);
        medSizeDimCar.add(dimTrunkCap370);
        medSizeDimCar.add(dimTrunkCap550);

        ArrayList<Dimension> bigSizeDimCar = new ArrayList<>();
        bigSizeDimCar.add(dimTrunkCap680);
        bigSizeDimCar.add(dimTrunkCap800);
        bigSizeDimCar.add(dimTrunkCap950);

        Car toyotaCorolla_Mod1 = new Car(toyota, false, business, Segment.standard, lowSizeDimCar);
        Car toyotaCorolla_Mod2 = new Car(toyota, true, cargo, Segment.medium, medSizeDimCar);
        Car kiaCeed_Mod1 = new Car(kia, false, transport, Segment.premium, bigSizeDimCar);
        Car volkswagenGolf_Mod1 = new Car(volkswagen, true, taxi, Segment.standard, medSizeDimCar);
        Car volkswagenGolf_Mod2 = new Car(volkswagen, false, business, Segment.medium, bigSizeDimCar);
        Car volvoV60_Mod1 = new Car(volvo, true, taxi, Segment.premium, lowSizeDimCar);
        Car audiQ8_Mod1 = new Car(audi, false, business, Segment.medium, lowSizeDimCar);
        Car audiQ8_Mod2 = new Car(audi, true, transport, Segment.premium, medSizeDimCar);
        Car opelAstra_Mod1 = new Car(opel, false, cargo, Segment.medium, medSizeDimCar);
        Car suzukiVitara_Mod1 = new Car(suzuki, true, bus, Segment.premium, bigSizeDimCar);
        Car bmwI4_Mod1 = new Car(bmw, true, cargo, Segment.medium, bigSizeDimCar);
        Car bmwI4_Mod2 = new Car(bmw, false, business, Segment.premium, medSizeDimCar);
        Car bmwI4V_Mod3 = new Car(bmw, true, bus, Segment.standard, lowSizeDimCar);
        Car mercedesGls_Mod1 = new Car(mercedes, false, taxi, Segment.medium, medSizeDimCar);
        Car renaultTrafic_Mod1 = new Car(renault, true, transport, Segment.premium, bigSizeDimCar);

        ArrayList<Car> newCars = new ArrayList<>();
        newCars.add(toyotaCorolla_Mod1);
        newCars.add(toyotaCorolla_Mod2);
        newCars.add(kiaCeed_Mod1);
        newCars.add(volkswagenGolf_Mod1);
        newCars.add(volkswagenGolf_Mod2);
        newCars.add(volvoV60_Mod1);
        newCars.add(audiQ8_Mod1);
        newCars.add(audiQ8_Mod2);
        newCars.add(opelAstra_Mod1);
        newCars.add(suzukiVitara_Mod1);
        newCars.add(bmwI4_Mod1);
        newCars.add(bmwI4_Mod2);
        newCars.add(bmwI4V_Mod3);
        newCars.add(mercedesGls_Mod1);
        newCars.add(renaultTrafic_Mod1);

        return newCars;
    }
}
