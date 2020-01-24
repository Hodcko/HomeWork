import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWithMatcherFind implements Finder{
    private String word;
    private String wordForPrint;

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public String getWordForPrint() {
        return wordForPrint;
    }

    public void setWordForPrint(String wordForPrint) {
        this.wordForPrint = wordForPrint;
    }
    public int finder() throws FileNotFoundException {
        String path = "/Users/valerij/desktop/W&P.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        int countOfWords = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите номер слова которое будем искать через matcher-find?\n 1.Война\n 2.Мир\n 3.И");
        switch (in.nextInt()) {
            case 1:
                setWord("\\b[В|в]ойна\\b");
                setWordForPrint("война");
                break;
            case 2:
                setWord("\\b[М|м]ир\\b");
                setWordForPrint("мир");
                break;
            case 3:
                setWord("\\b[И|и],?\\b");
                setWordForPrint("и");
                break;
            default:
                break;
        }
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            Pattern pattern = Pattern.compile(getWord());
            Matcher mathcer = pattern.matcher(line);
            while(mathcer.find()){
                countOfWords+= 1;
            }
        }
        System.out.println("Слово " + getWordForPrint() + " найдено "  + countOfWords + " раз");
        System.out.println("");
        return countOfWords;
    }
}


