package garage.cars;

import garage.cars.api.*;
import garage.parts.Engine;
import garage.parts.Key;
import garage.parts.Wheel;
import garage.parts.api.*;

public class Mercedes extends ACars {
    private String model;
    private IEngine engine;
    private IWheel wheel;
    private ILock lock;



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


        w204.open(myKey);
        w204.driverSeat(myDriver);
        w204.passengerSeat(4);
        w204.addFuel(FuelType.PREMIUM, 50);
        w204.start();
        w204.running();
        w204.addFuel(FuelType.PREMIUM, 50);
        w204.start();
        w204.running();









    }




































}
