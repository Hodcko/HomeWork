import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWithRegExp implements Finder{
    public int finder(String word, String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        int countOfWords = 0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            Pattern pattern = Pattern.compile(word);
            Matcher mathcer = pattern.matcher(line);
            while(mathcer.find()){
                countOfWords+= 1;
            }
        }
        System.out.println("Слово найдено " + countOfWords + " раз");
        return countOfWords;
    }
}


