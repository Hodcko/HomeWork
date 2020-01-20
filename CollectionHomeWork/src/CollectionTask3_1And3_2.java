import java.util.*;

public class CollectionTask3_1And3_2 {
    public static void main(String[] args) {
        List<Passport> passportArrayList = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 9; i++){
            passportArrayList.add(new Passport("" + random.nextInt(100), new Date(), "Иванов А.И."));
        }
        System.out.println("Вывод на консоль до филрации");
        for (Passport passport : passportArrayList) {
            System.out.println(passport);
        }
        System.out.println("Вывод на консоль после фильтрации");
//
//        FilterApplicator.filter(passportArrayList, new myComporator());
//
//        for (Passport passport : passportArrayList) {
//            System.out.println(passport);
//        }

        System.out.println("-----------------------------------------");

        List<Passport> passportArrayList2 = new ArrayList<>();
        Passport pas1 = new Passport(5);
        Passport pas2 = new Passport(4);
        Passport pas3 = new Passport(2);
        Passport pas4 = new Passport(1);
        Passport pas5 = new Passport(3);
        passportArrayList2.add(pas1);
        passportArrayList2.add(pas2);
        passportArrayList2.add(pas3);
        passportArrayList2.add(pas4);
        passportArrayList2.add(pas5);
        for (Passport passport : passportArrayList2) {
            System.out.println(passport);

        }



        Collection passport = FilterApplicator.sort(passportArrayList2);
        for (Object o : passport) {
            System.out.println(o);

        }


    }
}
