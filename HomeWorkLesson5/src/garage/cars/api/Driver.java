package garage.cars.api;
import garage.parts.api.IEngine;
import garage.parts.api.IKey;
import garage.parts.api.ILock;

import java.util.Random;

public class Driver implements IDriver {

    Random rand = new Random();

    
    private DriverLicense license;
    private boolean running = false;
    private boolean driversSeat = false;
    private boolean open = false;
    private String requiredLicense;
    private int numberOfSeats;
    private int amountOfGas;
    private int mileage;

    public String getRequiredLicense() {
        return requiredLicense;
    }

    @Override
    public DriverLicense getLicense() {
        return license;
    }

    public Driver(DriverLicense license){
        this.license = license;

    }

    @Override
    public void addFuel(FuelType type, int amountOfGas) {
        if (type.toString() != "PREMIUM") {
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
            if (driver.getLicense().toString() == myDriver.getLicense().toString()) {
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
            if (numberOfPassengers > 4) {
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
                mileage = 0;
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
    public void open(IKey key, ILock lock) {
        if(!open) {
            if (key.getKeySecret() == lock.getLockSecret()) {
                System.out.println("Car is open");
                open = true;
            } else {
                System.out.println("The key is not suitable");
            }
        }else {
            System.out.println("The car is already open");
        }
    }




}
