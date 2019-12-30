package garage.cars.api;


import garage.parts.Engine;
import garage.parts.Key;
import garage.parts.Lock;
import garage.parts.Wheel;
import garage.parts.api.*;



public abstract class ACars implements ICar{


    private int numberOfSeats;
    private String requiredLicense;


    public static ILock myLock = new Lock("QWERTY");
    public static IEngine myEngine = new Engine(3000, FuelType.PREMIUM, "M54B30");
    public static IWheel myWeel = new Wheel(17, "Nokian", WheelType.WINTER);
    public static IKey myKey = new Key("QWERTY");
    public static IDriver myDriver = new Driver(DriverLicense.TYPE_B);




    public void setRequiredLicense(String requiredLicense) {
        this.requiredLicense = requiredLicense;
    }

    public String getRequiredLicense() {
        return requiredLicense;
    }


    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getBrand() {
        return null;
    }




}
