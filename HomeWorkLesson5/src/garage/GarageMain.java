package garage;

import garage.cars.Audi;
import garage.cars.Bmw;
import garage.cars.Mercedes;
import garage.cars.api.DriverLicense;
import garage.cars.api.FuelType;
import garage.cars.api.Keys;
import garage.cars.api.WheelType;

public class GarageMain {
    public static void main(String[] args) {


        Audi audiA4 = new Audi("A4", 4);
        audiA4.open(Keys.AUDIKEY); //открываем машину нужным ключем
        audiA4.start(DriverLicense.TYPE_B); //пробуем завести, предъявив водительсоке нужное удостоверение...нет горючего
        audiA4.addFuel(FuelType.PREMIUM, 5); //заправляем машину нужным топливом
        audiA4.start(DriverLicense.TYPE_B);// успешно заводим
        audiA4.drive();//едем пока не закончится топливо
        System.out.println("");



        Bmw bmwE90 = new Bmw("E90", 4);
        bmwE90.open(Keys.BMWKEY);//открываем машину нужным ключем
        bmwE90.start(DriverLicense.TYPE_B);//пробуем завести, предъявив водительсоке нужное удостоверение...нет горючего
        bmwE90.addFuel(FuelType.DIESEL, 5);//заправляем машину нужным топливом
        bmwE90.start(DriverLicense.TYPE_B);// успешно заводим
        bmwE90.drive();//едем пока не закончится топливо
        System.out.println("");



        Mercedes mercedesW204 = new Mercedes("W204", 5);
        mercedesW204.open(Keys.MERCEDESKEY);//открываем машину нужным ключем
        mercedesW204.start(DriverLicense.TYPE_B);//пробуем завести, предъявив водительсоке нужное удостоверение...нет горючего
        mercedesW204.addFuel(FuelType.DIESEL, 5);//заправляем машину нужным топливом
        mercedesW204.start(DriverLicense.TYPE_B);// успешно заводим
        mercedesW204.drive();//едем пока не закончится топливо











    }
}
