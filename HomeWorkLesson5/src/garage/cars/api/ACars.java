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
    public String getModel() {
        return null;
    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public boolean open(IKey key) {
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
        return open;

    }

    @Override
    public boolean close(IKey key) {
        if(open) {
            if (key.getKeySecret() == myLock.getLockSecret()) {
                System.out.println("Car is closed");
                open = false;
            } else {
                System.out.println("The key is not suitable");
            }
        }else {
            System.out.println("The car is already closed");
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
                System.out.println("Need another drivers license");
            }
        }else{
            System.out.println("Car is closed");
        }
        return driversSeat;
    }

    @Override
    public boolean passengerSeat(int numberOfPassengers) {
        if(open) {
            if (numberOfPassengers > (numberOfSeats - 1)) {
                System.out.println("All passengers will not fit");
            } else {
                System.out.println("All passengers fit");
                passengerSeat = true;
            }
        }else {
            System.out.println("Car is closed");
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
                    System.out.println("Car is already started");
                    }
                } else {
                System.out.println("Fuel tank in empty");
            }
            } else{
                System.out.println("Nobody at drivers seat");
            }
        return started;
    }



    @Override
    public boolean stop() {
        if(started){
            started = false;
            System.out.println("Car is stopped");
        } else {
            System.out.println("Car is already stopped");
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
        if(open) {
            if (!started) {
                if (type.toString() != myEngine.getFuelType().toString()) {
                    System.out.println("Need best quality gas");
                    return;
                }
                if (amountOfGas > 70) {
                    System.out.println("Does not fit");
                    return;
                }
                this.amountOfGas = amountOfGas;
                System.out.printf("%d litres added\n", amountOfGas);
            } else {
                System.out.println("The car must be stopped");
            }
        }else{
            System.out.println("Car is closed");
        }
    }

}
