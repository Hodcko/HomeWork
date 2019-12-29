//package garage.cars;
//
//import garage.cars.api.*;
//import garage.cars.api.FuelType;
//import garage.cars.api.WheelType;
//
//public class Audi extends ACars {
//
//
//    double engineCapacity;
//    String engineName;
//    FuelType type;
//
//    double wheelRadius;
//    String wheelName;
//    WheelType typeW;
//
//    String carModel;
//
//
//
//
//
//    // конструктор по умочанию
//    public Audi() {
//    }
//
//    // конструктор для создания двигателя
//    public Audi(double engineCapacity, String engineName, FuelType type) {
//        this.engineCapacity = engineCapacity;
//        this.engineName = engineName;
//        this.type = type;
//
//    }
//
//    // конструктор для создания колес
//    public Audi(double wheelRadius, String wheelName, WheelType typeW) {
//        this.wheelRadius = wheelRadius;
//        this.wheelName = wheelName;
//        this.typeW = typeW;
//    }
//
//    // конструктор для создания автомобиля
//    public Audi(String carModel, int numberOfSeats) {
//        this.carModel = carModel;
//        this.numberOfSeats = numberOfSeats;
//    }
//
//    public static Audi audiEngine = new Audi(3.0, "BCAA", FuelType.PREMIUM);
//    public static Audi audiWheel = new Audi(17.0, "Nokian", WheelType.WINTER);
//    //public static Audi audiA4 = new Audi("A4", 5);
//
//
//
//    // функция для заводки автомобиля
//    @Override
//    public void start(DriverLicense license) {
//        if (!openDoor){
//            System.out.println("Audi is closed. Open to start");
//            return;
//        }
//        if (license.toString() != "TYPE_B") {
//            System.out.println("You are have not required driver's license");
//            return;
//        }
//        if (amountOfFuel < 1){
//            System.out.println("Fuel tank is empty");
//            return;
//        }
//        if ((audiEngine != null) && (audiWheel != null)) {
//            System.out.println("Audi started up");
//        }
//        carStart = true;
//    }
//
//    // функция для заправки автомобиля
//    @Override
//    public void addFuel(FuelType type, int amountOfGas) {
//        if (type.toString() != "PREMIUM") {
//            System.out.println("Need best quality gas");
//            return;
//        }
//        if (amountOfGas > 70){
//            System.out.println("Does not fit");
//            return;
//        }
//        amountOfFuel = amountOfGas;
//        System.out.printf("%d litres added\n", amountOfGas);
//    }
//
//    //функция для открытия дверей
//    @Override
//    public void open(Keys key) {
//        if (key.toString() == "AUDIKEY") {
//            System.out.println("Audi is open");
//            openDoor = true;
//        }else {
//            System.out.println("Use another key");
//        }
//    }
//
//    //функция для езды
//    @Override
//    public void drive() {
//        if (!carStart){
//            System.out.println("First you need start the car");
//            return;
//        }
//        for(int i = 1; i <= amountOfFuel; i ++) {
//            System.out.println("Audi rides...");
//            if (i == amountOfFuel){
//                System.out.println("Audi stops slowly, fuel tank is empty");
//            }
//        }
//
//    }
//
//    // фукнкция для замены двигателя
//    @Override
//    public void changeEngine(double engineCapacity, String engineName, FuelType type){
//        audiEngine = new Audi(engineCapacity, engineName, type);
//    }
//
//    //функция для замены колес
//    @Override
//    public void changeWheels(double wheelRadius, String wheelName, WheelType type){
//        audiWheel= new Audi(wheelRadius, wheelName, type);
//    }
//
//
//
//
//
//
//
//
//
//}
