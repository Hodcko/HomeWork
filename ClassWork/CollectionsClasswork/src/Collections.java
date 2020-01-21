package CollectionsClasswork.src;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<Passport> collection = new ArrayList<>();
        Passport passport1 = new Passport();
        passport1.setId("MP....12121");
        passport1.setEffectiveAt(new Date());
        passport1.setFio("Александр Игоревич");

        Passport passport2 = new Passport();
        passport2.setId("MP....12121");
        passport2.setEffectiveAt(new Date());
        passport2.setFio("Александр Игоревич");

        collection.add(passport2);
        collection.add(passport1);

        collection.remove(passport1);


        for (Passport passport : collection) {
            System.out.println(passport);
        }

        for (int i = 0; i < collection.size(); i++) {
            System.out.println(i + " " +collection.get(i));
        }
    }
}
