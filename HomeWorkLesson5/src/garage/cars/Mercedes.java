package garage.cars;

import garage.cars.api.*;
import garage.parts.api.*;

public class Mercedes extends ACars {
    private String model;
    private IEngine engine;
    private IWheel wheel;
    private ILock lock;
    private int amountOfGas;



    public Mercedes(String model, String requiredLicense, int numberOfSeats, IEngine engine, IWheel wheel, ILock lock){
        this.model = model;
        this.engine = engine;
        this.wheel = wheel;
        this.lock = lock;
        setNumberOfSeats(numberOfSeats);
        setRequiredLicense(requiredLicense);

    }


    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return "Mercedes";
    }


    public static Mercedes w204 = new Mercedes("W204", "TYPE_B",5,
            myEngine, myWeel, myLock);



    public static void main(String[] args) {


        myDriver.open(myKey, myLock);
        myDriver.driverSeat(myDriver);
        myDriver.passengerSeat(4);
        myDriver.addFuel(FuelType.PREMIUM, 20);
        myDriver.start();
        myDriver.running();
        myDriver.addFuel(FuelType.PREMIUM, 30);
        myDriver.start();
        myDriver.stop();
        myDriver.close();

























    }




































}
