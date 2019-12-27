package garage.cars;

import garage.cars.api.*;

public class Mercedes extends ACars{


    double engineCapacity;
    String engineName;
    FuelType type;

    double wheelRadius;
    String wheelName;
    WheelType typeW;

    String carModel;





    // конструктор по умочанию
    public Mercedes() {
    }

    // конструктор для создания двигателя
    public Mercedes(double engineCapacity, String engineName, FuelType type) {
        this.engineCapacity = engineCapacity;
        this.engineName = engineName;
        this.type = type;

    }

    // конструктор для создания колес
    public Mercedes(double wheelRadius, String wheelName, WheelType typeW) {
        this.wheelRadius = wheelRadius;
        this.wheelName = wheelName;
        this.typeW = typeW;
    }

    // конструктор для создания автомобиля
    public Mercedes(String carModel, int numberOfSeats) {
        this.carModel = carModel;
        this.numberOfSeats = numberOfSeats;
    }

    public static Mercedes mercedesEngine = new Mercedes(3.0, "BCAA", FuelType.DIESEL);
    public static Mercedes mercedesWheel = new Mercedes(17.0, "Nokian", WheelType.WINTER);
    //public static Mercedes w204 = new Mercedes("325", 5);



    // функция для заводки автомобиля
    @Override
    public void start(DriverLicense license) {
        if (!openDoor){
            System.out.println("Mercedes is closed. Open to start");
            return;
        }
        if (license.toString() != "TYPE_B") {
            System.out.println("You are have not required driver's license");
            return;
        }
        if (this.amountOfFuel < 1){
            System.out.println("Fuel tank is empty");
            return;
        }
        if ((mercedesEngine != null) && (mercedesWheel != null)) {
            System.out.println("Mercedes started up");
        }
        carStart = true;
    }

    // функция для заправки автомобиля
    @Override
    public void addFuel(FuelType type, int amountOfGas) {
        if (type.toString() != "DIESEL") {
            System.out.println("Need diesel fuel");
            return;
        }
        if (amountOfGas > 80){
            System.out.println("Does not fit");
            return;
        }
        amountOfFuel = amountOfGas;
        System.out.printf("%d litres added\n", amountOfGas);
    }

    //функция для открытия дверей
    @Override
    public void open(Keys key) {
        if (key.toString() == "MERCEDESKEY") {
            System.out.println("Mercedes is open");
            openDoor = true;
        }else {
            System.out.println("Use another key");
        }
    }

    //функция для езды
    @Override
    public void drive() {
        if (!carStart){
            System.out.println("First you need start the car");
            return;
        }
        for(int i = 1; i <= amountOfFuel; i ++) {
            System.out.println("Mercedes rides...");
            if (i == amountOfFuel){
                System.out.println("Mercedes stops slowly, fuel tank is empty");
            }
        }
    }

    // фукнкция для замены двигателя
    @Override
    public void changeEngine(double engineCapacity, String engineName, FuelType type){
        mercedesEngine = new Mercedes(engineCapacity, engineName, type);
    }

    //функция для замены колес
    @Override
    public void changeWheels(double wheelRadius, String wheelName, WheelType type){
        mercedesWheel= new Mercedes(wheelRadius, wheelName, type);
    }




























}
