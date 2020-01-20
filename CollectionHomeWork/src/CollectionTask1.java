import java.util.*;


public class CollectionTask1 {
    public static void main(String[] args) {
        List<Passport> passportArrayList = new ArrayList<>();
        long startTime, endTime, startDeleteTime, endDeleteTime;
        Random random = new Random();

        startTime = System.currentTimeMillis();
        for(int i = 0; i < 10_000_000; i++){
            passportArrayList.add(new Passport("" + random.nextInt(10_000_000), new Date(), "Иванов А.И."));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Размер ArrayList до удаления объектов: " + passportArrayList.size());

        startDeleteTime = System.currentTimeMillis();
        for(int i = 9999999; i >= 0; i --){
            passportArrayList.remove(i);
        }
        endDeleteTime = System.currentTimeMillis();
        System.out.println("Размер ArrayList после удаления всех объектов: " + passportArrayList.size());

        List<Passport> passportLinkedList = new LinkedList<>();
        long startTime2, endTime2, startDeleteTime2, endDeleteTime2;
        startTime2 = System.currentTimeMillis();
        for(int i = 0; i < 10_000_000; i++){
            passportLinkedList.add(new Passport("" + random.nextInt(10_000_000), new Date(), "Иванов А.И."));
        }
        endTime2 = System.currentTimeMillis();
        System.out.println("Размер LinkedList до удаления объектов: " + passportLinkedList.size());

        startDeleteTime2 = System.currentTimeMillis();
        for(int i = 9999999; i >= 0; i --){
            passportLinkedList.remove(i);
        }
        endDeleteTime2 = System.currentTimeMillis();
        System.out.println("Размер LinkedList после удаления всех объектов: " + passportLinkedList.size());
        System.out.println("Время добавления 10 000 000 элементов в ArrayList: " + (endTime - startTime));
        System.out.println("Время добавления 10 000 000 элементов в LinkedList: " + (endTime2 - startTime2));
        System.out.println("Время удаления 10 000 000 элементов из ArrayList: " + (endDeleteTime - startDeleteTime));
        System.out.println("Время удаления 10 000 000 элементов из ArrayList: " + (endDeleteTime2 - startDeleteTime2));
    }
}

