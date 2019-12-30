package garage.cars.api;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import garage.cars.Audi;
import garage.parts.api.IEngine;
import garage.parts.api.IKey;
import garage.parts.api.IWheel;

public abstract class ACars implements ICar, IEngine, IWheel, IKey {


     public int numberOfSeats;
     public int amountOfFuel;
     public boolean openDoor = false;
     public boolean carStart = false;



    @Override
    public void addFuel(FuelType type, int amountOfGas) {
    }

    @Override
    public void open(Keys key) {
        openDoor = true;
    }

    @Override
    public void drive() {
        if (!carStart){
            System.out.println("First you need start the car");
            return;
        }
            for(int i = 1; i <= amountOfFuel; i ++) {
                System.out.println("Car rides...");
                if (i == amountOfFuel){
                    System.out.println("The car stops slowly, fuel tank is empty");
                }
            }
    }

    @Override
    public void start(DriverLicense license) {
        if (!openDoor){
            System.out.println("Car is closed. Open to start");
            return;
        }
        if (license.toString() != "TYPE_B") {
            System.out.println("You are have not required driver's license");
            return;
        }
        if (amountOfFuel < 1){
            System.out.println("Fuel tank is empty");
        }
        carStart = true;
    }

    @Override
    public void changeEngine(double engineCapacity, String engineName, FuelType type){
    }

    @Override
    public void changeWheels(double wheelRadius, String wheelName, WheelType type){
    }



    //функции есть в ICar, но пока не используются и не имеют конечной реализации

    @Override
    public void close() {
        System.out.println("Door is closed");
    }

    @Override
    public void stop() {
        System.out.println("The car stopped");

    }

    @Override
    public int passengerSeat() {
        return numberOfSeats;

    }
    @Override
    public void driverSeat(DriverLicense license) {
        if ((license.toString() == "TYPE_B" || (license.toString() == "TYPE_C")))
        {
            System.out.println("You can drive this car");
        }else{
            System.out.println("You are have not required driver's license");
        }
    }


}
