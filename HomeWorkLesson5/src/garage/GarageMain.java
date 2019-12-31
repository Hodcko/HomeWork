
import garage.cars.Mercedes;
import garage.cars.api.*;
import garage.parts.Engine;
import garage.parts.Key;
import garage.parts.Lock;
import garage.parts.Wheel;
import garage.parts.api.IEngine;
import garage.parts.api.IKey;
import garage.parts.api.ILock;
import garage.parts.api.IWheel;

public class GarageMain{
    public static void main(String[] args) {

        ILock myLock = new Lock("QWERTY");
        IEngine myEngine = new Engine(3000, FuelType.PREMIUM, "M54B30");
        IWheel myWeel = new Wheel(17, "Nokian", WheelType.WINTER);
        IKey myKey = new Key("QWERTY");
        Driver myDriver = new Driver(DriverLicense.TYPE_B);
        Mercedes w204 = new Mercedes("W204", "TYPE_B", 5, myEngine, myWeel, myLock);



        w204.open(myKey);
        if(w204.isOpen()) {
            w204.driverSeat(myDriver);
            if(w204.isDriversSeat()) {
                w204.passengerSeat(4);
                w204.addFuel(FuelType.PREMIUM, 50);
                w204.start();
                if(w204.isStarted()) {
                    w204.running();
                    w204.addFuel(FuelType.PREMIUM, 50);
                    w204.start();
                    w204.running();
                    w204.close(myKey);
                }
            }
        }




    }
}
