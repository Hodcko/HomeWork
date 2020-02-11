
import java.io.*;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaMain {
    public static void main(String[] args) {
        List<Student> students = Stream
                .generate(() -> new Student(randomName(5), new Random().nextInt(11)))
                .limit(100)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Все студенты\n " + students);
        System.out.println(students.size());
        save(students, "allStudents.txt");


        List<Student> underperformingStudents = load("allStudents.txt").stream()
                .filter(Student -> Student !=null)
                .filter(Student -> Student.getGrade() < 8)
                .skip(3)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Студенты с баллом меньше 8\n " + underperformingStudents);
        System.out.println(underperformingStudents.size());
        save(underperformingStudents, "underperformingStudents.txt");

    }


    static String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom random = new SecureRandom();

    static String randomName( int lenth ){
        StringBuilder sb = new StringBuilder( lenth );
        for( int i = 0; i < lenth; i++)
            sb.append( symbols.charAt( random.nextInt(symbols.length()) ) );
        return sb.toString();
    }

    static void save(List<Student> students, String fileName)  {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static List<Student> load(String fileName) {
        List<Student> students = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName)) ) {
            students = ((List<Student>) ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
