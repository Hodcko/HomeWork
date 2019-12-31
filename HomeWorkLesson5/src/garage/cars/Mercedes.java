package garage.cars;

import garage.cars.api.ACars;
import garage.parts.api.IEngine;
import garage.parts.api.ILock;
import garage.parts.api.IWheel;

public class Mercedes extends ACars {
    private String model;
    private IWheel wheel;


    public Mercedes(String model, String requiredLicense, int numberOfSeats, IEngine engine, IWheel wheel, ILock lock) {
        super(lock, engine);
        this.model = model;
        this.wheel = wheel;
        setNumberOfSeats(numberOfSeats);
        setRequiredLicense(requiredLicense);

    }


    public String getModel() {
        return model;
    }

    public String getBrand() {
        return "Mercedes";
    }
}
