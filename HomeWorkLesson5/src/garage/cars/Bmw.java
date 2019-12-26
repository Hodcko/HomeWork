package garage.cars;

import garage.cars.api.*;

public class Bmw extends ACars {

    double engineCapacity;
    String engineName;
    FuelType type;

    double wheelRadius;
    String wheelName;
    WheelType typeW;

    String carModel;







    // конструктор по умочанию
    public Bmw() {
    }

    // конструктор для создания двигателя
    public Bmw(double engineCapacity, String engineName, FuelType type) {
        this.engineCapacity = engineCapacity;
        this.engineName = engineName;
        this.type = type;

    }

    // конструктор для создания колес
    public Bmw(double wheelRadius, String wheelName, WheelType typeW) {
        this.wheelRadius = wheelRadius;
        this.wheelName = wheelName;
        this.typeW = typeW;
    }

    // конструктор для создания автомобиля
    public Bmw(String carModel, int numberOfSeats) {
        this.carModel = carModel;
        this.numberOfSeats = numberOfSeats;
    }

    public static Bmw bmwEngine = new Bmw(3.0, "BCAA", FuelType.PLUS);
    public static Bmw bmwWheel = new Bmw(17.0, "Nokian", WheelType.WINTER);
    //public static Bmw bmw325 = new Bmw("325", 5);



    // функция для заводки автомобиля
    @Override
    public void start(DriverLicense license) {
        if (license.toString() != "TYPE_B") {
            System.out.println("You are have not required driver's license");
            return;
        }
        if (amountOfFuel < 1){
            System.out.println("Fuel tank is empty");
            return;
        }
        if ((bmwEngine != null) && (bmwWheel != null)) {
            System.out.println("BMW started up");
        }
    }

    // функция для заправки автомобиля
    @Override
    public void addFuel(FuelType type, int amountOfGas) {
        if ((type.toString() == "REGULAR") || (type.toString() == "PREMIUM")) {
            System.out.println("Only PLUS !!!");
            return;
        }
        if (amountOfGas > 60){
            System.out.println("Does not fit");
            return;
        }
        amountOfFuel = amountOfGas;
        System.out.printf("%d litres added\n", amountOfGas);
    }

    //функция для открытия дверей
    @Override
    public void open(Keys key) {
        if (key.toString() == "BMWKEY") {
            System.out.println("Door is open");
        }else {
            System.out.println("Use another key");
        }
    }

    //функция для езды
    @Override
    public void drive() {
        for(int i = 1; i <= amountOfFuel; i ++) {
            System.out.println("BMW rides fast...");
            if (i == amountOfFuel){
                System.out.println("The car stops slowly, fuel tank is empty");
            }
        }
    }

    // фукнкция для замены двигателя
    @Override
    public void changeEngine(double engineCapacity, String engineName, FuelType type){
        bmwEngine = new Bmw(engineCapacity, engineName, type);
    }

    //функция для замены колес
    @Override
    public void changeWheels(double wheelRadius, String wheelName, WheelType type){
        bmwWheel= new Bmw(wheelRadius, wheelName, type);
    }







}


