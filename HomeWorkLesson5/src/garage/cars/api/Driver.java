package garage.cars.api;

public class Driver implements IDriver {

    private DriverLicense license;


    @Override
    public DriverLicense getLicense() {
        return license;
    }

    public Driver(DriverLicense license){
        this.license = license;
    }
}

