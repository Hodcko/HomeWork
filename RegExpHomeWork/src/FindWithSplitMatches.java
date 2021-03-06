import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindWithSplitMatches implements Finder{
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
        System.out.println("Укажите номер слова которое будем искать через matches?\n 1.Война\n 2.Мир\n 3.И");
        switch (in.nextInt()) {
            case 1:
                setWord("\"?\\b[В|в]ойна\\b([,.\"?)]+)?");
                setWordForPrint("война");
                break;
            case 2:
                setWord("\\b[М|м]ир\\b([,.\"?)]+)?");
                setWordForPrint("мир");
                break;
            case 3:
                setWord("\\b[И|и]\\b([,.)]+)?");
                setWordForPrint("и");
                break;
            default:
                break;
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].matches(getWord())) {
                    countOfWords += 1;
                }
            }
        }
        System.out.println("Слово " +getWordForPrint() + " найдено " + countOfWords + " раз");
        return countOfWords;
    }
}
