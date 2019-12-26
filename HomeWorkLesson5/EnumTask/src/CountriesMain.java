import api.ICountries;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CountriesMain {
    public static void main (String[] args) {
        Countries country = Countries.valueOf("BELARUS");
        Countries country2 = Countries.BELARUS;
        System.out.println(country == country2); //true
        //ICountries country3 = Countries.valueOf("USA"); ошибка при прикомпиляции, ругается на отсутсвие такого энума

        Countries country3 = Countries.RUSSIA;
        System.out.println(country2.compare(country3)); // кастомный метод для сравнения площадей стран, т.к.
                                                        // compareTo final и не может быть переопределен в энуме













    }

}
