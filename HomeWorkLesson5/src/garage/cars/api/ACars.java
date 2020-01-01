package garage.cars.api;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import garage.parts.Engine;
import garage.parts.Key;
import garage.parts.Lock;
import garage.parts.Wheel;
import garage.parts.api.*;

import java.util.Random;

public abstract class ACars implements ICar{

    Random rand = new Random();
    private boolean started = false;
    private boolean driversSeat = false;
    private boolean open = false;
    private boolean passengerSeat = false;
    private int amountOfGas;
    private int mileage;
    private int numberOfSeats;
    private String requiredLicense;

    private ILock myLock;
    private IEngine myEngine;


    public ACars(ILock myLock, IEngine myEngine){
        this.myLock = myLock;
        this.myEngine = myEngine;
    }

    @Override
    public boolean isOpen() {
        return open;
    }

    @Override
    public boolean isStarted() {
        return started;
    }

    @Override
    public boolean isDriversSeat() {
        return driversSeat;
    }


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
    public boolean open(IKey key) {
        if(!open) {
            if (key.getKeySecret() == myLock.getLockSecret()) {
                System.out.println("Car is open");
                open = true;
            } else {
                throw new IllegalArgumentException("The key is not suitable");
            }
        }else {
            throw new IllegalArgumentException("The car is already open");
        }
        return open;

    }

    @Override
    public boolean close(IKey key) {
        if(open) {
            if (key.getKeySecret() == myLock.getLockSecret()) {
                System.out.println("Car is closed");
                open = false;
            } else {
                throw new IllegalArgumentException("The key is not suitable");
            }
        }else {
            throw new IllegalArgumentException("The car is already closed");
        }
        return !open;
    }

    /**
     * @result if true OK if else
     * @param driver
     */
    @Override
    public boolean driverSeat(IDriver driver) {
        if(open) {
            if (driver.getLicense().toString() == getRequiredLicense()) {
                System.out.println("You sat in the driver's seat");
                driversSeat = true;
            }else {
                throw new IllegalArgumentException("Need another drivers license");
            }
        }else{
            throw new IllegalArgumentException("Car is closed");
        }
        return driversSeat;
    }

    @Override
    public boolean passengerSeat(int numberOfPassengers) {
        if(open) {
            if (numberOfPassengers > (numberOfSeats - 1)) {
                throw new IllegalArgumentException("All passengers will not fit");
            } else {
                System.out.println("All passengers fit");
                passengerSeat = true;
            }
        }else {
            throw new IllegalArgumentException("Car is closed");
        }
        return passengerSeat;
    }

    @Override
    public boolean start() {
        if (driversSeat) {
            if (amountOfGas > 0) {
                if (!started) {
                    started = true;
                    System.out.println("The car is started up");
                } else {
                    throw new IllegalArgumentException("Car is already started");
                }
            } else {
                throw new IllegalArgumentException("Fuel tank in empty");
            }
        } else{
            throw new IllegalArgumentException("Nobody at drivers seat");
        }
        return started;
    }

    @Override
    public boolean stop() {
        if(started){
            started = false;
            System.out.println("Car is stopped");
        } else {
            throw new IllegalArgumentException("Car is already stopped");
        }
        return !started;
    }

    @Override
    public double running() {
        if (started) {
            if (amountOfGas > 0) {
                for (int i = 1; i < amountOfGas; i += rand.nextInt(2)) {
                    mileage++;
                }
                System.out.printf("You drove %d kilometers\n", mileage);
                System.out.println("Car is stopped");
                started = false;
                mileage = 0;
            }else{
                throw new IllegalArgumentException("Fuel tank in empty");
            }
        } else {
            throw new IllegalArgumentException("The car is not started up");
        }
        return 0;
    }

    @Override
    public void addFuel(FuelType type, int amountOfGas) {
        if(open) {
            if (!started) {
                if (type.toString() != myEngine.getFuelType().toString()) {
                    throw new IllegalArgumentException("Need best quality gas");
                }
                if (amountOfGas > 70) {
                    throw new IllegalArgumentException("Does not fit in fuel tank");
                }
                this.amountOfGas = amountOfGas;
                System.out.printf("%d litres added\n", amountOfGas);
            } else {
                throw new IllegalArgumentException("The car must be stopped");
            }
        }else{
            throw new IllegalArgumentException("Car is closed");
        }
    }
}
