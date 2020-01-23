
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpMain{
    public static void main(String[] args) throws FileNotFoundException {
        String str = "Я люблю JAVA";
        System.out.println(str.matches("h*"));// везде false т.к. matches возвращает true ТОЛЬКО если находит
        System.out.println(str.matches("h+"));
        System.out.println(str.matches("h?"));
        Pattern pt = Pattern.compile("h*");
        Pattern pt2 = Pattern.compile("h+");
        Pattern pt3 = Pattern.compile("h?");
        Matcher mathcer = pt.matcher(str);
        Matcher mathcer2 = pt2.matcher(str);
        Matcher mathcer3 = pt3.matcher(str);
        while (mathcer.find()) {
            System.out.println("h*: " + mathcer.find()); //find возвращает true на каждой итерации, т.к. * подразумевает
        }                                                 // 0 и более символов. В нашем случае 0.
        while (mathcer2.find()) {
            System.out.println("h+: " + mathcer2.find());//find возвращает false, т.к. + подразумевает 1 и более симоволов.
        }                                                 //В нашем случае 0.
        while (mathcer3.find()) {
            System.out.println("h?: " + mathcer3.find());//find возвращает true на каждой итерации, т.к. * подразумевает
        }                                                 // 0 или 1 символ. В нашем случае 0.


        String path = "/Users/valerij/desktop/W&P.txt";

        String war = "\\b[В|в]ойна\\b";
        String warString = "\"?\\b[В|в]ойна\\b([,.\"?)]+)?";

        String peace = "\\b[М|м]ир\\b";
        String peaceString = "\\b[М|м]ир\\b([,.\"?)]+)?";

        String and = "\\b[И|и],?\\b";
        String andString = "\\b[И|и]\\b([,.)]+)?";

        FindWithRegExp finder = new FindWithRegExp();
        finder.finder(and, path);

        FindЕhrougSplit finder2 = new FindЕhrougSplit();
        finder2.finder(andString, path);

    }

}
