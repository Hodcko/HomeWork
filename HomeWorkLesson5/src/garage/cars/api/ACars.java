package garage.cars.api;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import garage.cars.Mercedes;
import garage.parts.Engine;
import garage.parts.Key;
import garage.parts.Lock;
import garage.parts.Wheel;
import garage.parts.api.*;

import java.util.Random;

public abstract class ACars implements ICar{

    private boolean running = false;
    private boolean driversSeat = false;
    private boolean open = false;
    private int amountOfGas;
    private int mileage;
    private int numberOfSeats;
    private String requiredLicense;
    Random rand = new Random();

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

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public void open(IKey key) {
        if(!open) {
            if (key.getKeySecret() == myLock.getLockSecret()) {
                System.out.println("Car is open");
                open = true;
            } else {
                System.out.println("The key is not suitable");
            }
        }else {
            System.out.println("The car is already open");
        }
    }

    @Override
    public void close() {
        if (open){
            open = false;
            System.out.println("Car is closed");
        }else{
            System.out.println("Car is already closed");
        }
    }

    @Override
    public void driverSeat(IDriver driver) {
        if(open) {
            if (driver.getLicense().toString() == getRequiredLicense()) {
                System.out.println("You sat in the driver's seat");
                driversSeat = true;
            }else {
                System.out.println("Need another drivers license");
            }
        }else{
            System.out.println("Car is closed");
        }
    }

    @Override
    public void passengerSeat(int numberOfPassengers) {
        if(open) {
            if (numberOfPassengers > (numberOfSeats - 1)) {
                System.out.println("All passengers will not fit");
            } else {
                System.out.println("All passengers fit");
            }
        }else {
            System.out.println("Car is closed");
        }

    }


   @Override
    public void start() {
        if (driversSeat) {
            if (amountOfGas > 0) {
                if (!running) {
                    running = true;
                    System.out.println("The car is started up");
                   } else {
                    System.out.println("Car is already running");
                    }
                } else {
                System.out.println("Fuel tank in empty");
            }
            } else{
                System.out.println("You are not at drivers seat");
            }
    }



    @Override
    public void stop() {
        if(running){
            running = false;
            System.out.println("Car is stopped");
        } else {
            System.out.println("Car is already stopped");
        }
    }

    @Override
    public double running() {
        if (running) {
                if (amountOfGas > 0) {
                    for (int i = 1; i < amountOfGas; i += rand.nextInt(2)) {
                        mileage++;
                    }
                    System.out.printf("You drove %d kilometers\n", mileage);
                    System.out.println("Car is stopped");
                    running = false;
                }else{
                    System.out.println("Fuel tank in empty");
                    return 0;
                }
        } else {
            System.out.println("The car is not started up");
        }
        return 0;
    }

    @Override
    public void addFuel(FuelType type, int amountOfGas) {
        if (type.toString() != myEngine.getFuelType().toString()) {
            System.out.println("Need best quality gas");
            return;
        }
        if (amountOfGas > 70){
            System.out.println("Does not fit");
            return;
        }
        this.amountOfGas = amountOfGas;
        System.out.printf("%d litres added\n", amountOfGas);

    }




}
