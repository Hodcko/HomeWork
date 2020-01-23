import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindЕhrougSplit implements Finder{
    public int finder(String word, String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        int countOfWords = 0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].matches(word)){
                    countOfWords += 1;
                }
            }
        }
        System.out.println("Слово найдено " + countOfWords + " раз");
        return countOfWords;
    }
}
