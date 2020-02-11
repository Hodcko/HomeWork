
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaMain {
    public static void main(String[] args) {
        Saver saver = new Saver();
        Loader loader = new Loader();
        University university = new University();

        File allStudents = new File("allStudents.txt");
        File noSertificatedStudents = new File("underperformingStudents.txt");

//      Читаем студентов из файла или генерим новых
        if(allStudents.exists()){
            university.setAllStudents(loader.load(allStudents.getPath()));
        }else {
            List<Student> students = Stream
                    .generate(() -> new Student(university.randomName(5), new Random().nextInt(11)))
                    .limit(100)
                    .collect(Collectors.toCollection(ArrayList::new));
            university.setAllStudents(students);
            saver.save(students, allStudents.getPath());
        }
        System.out.println("Все студенты\n " + university.getAllStudents());
        System.out.println("Количество всех студентов: " + university.getAllStudents().size() + "\n");

//      Сортируем по оценке и выбираем студентов с баллом меньше 7
        List<Student> underperformingStudents = loader.load(allStudents.getPath()).stream()
                .filter(Student -> Student !=null)
                .sorted(Comparator.comparing(Student::getGrade))
                .filter(Student -> Student.getGrade() < 7)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Студенты с баллом меньше 7\n " + underperformingStudents);
        System.out.println("Количество студентов с баллом меньше 7: " + underperformingStudents.size() + "\n");
        saver.save(underperformingStudents, noSertificatedStudents.getPath());

//      Удаляем студентов с золотым билетом из списка студентов с баллом меньше 7
        List<Student> unSertificatedStudents = loader.load(noSertificatedStudents.getPath()).stream()
                .limit(underperformingStudents.size()-3)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Студенты без сертификата \n" + unSertificatedStudents);
        System.out.println("Количество студентов без сертификата: " + unSertificatedStudents.size());
        saver.save(unSertificatedStudents, noSertificatedStudents.getPath());

//        Альтернативный вариант поиска студентов с золотым билетом
//        List<Student> unSertificatedStudents = findLuckers(loader.load(noSertificatedStudents.getPath()), 3);
//        saver.save(unSertificatedStudents, noSertificatedStudents);


    }

    public static List<Student> findLuckers(List<Student> students, int numberOfLuckers){
        Random random = new Random();
        while (numberOfLuckers > 0){
            int numberOfLucker = random.nextInt(students.size());
            System.out.println(students.get(numberOfLucker) + ", тебе повезло");
            students.remove(numberOfLucker);
            numberOfLuckers--;
        }
        return students;
    }
}
