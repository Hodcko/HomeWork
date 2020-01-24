
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpMain{
    public static void main(String[] args) throws FileNotFoundException {
        String str = "Я люблю JAVA";
        System.out.println(str.matches("h*"));// везде false т.к. matches сранивает всю строку с паттерном
        System.out.println(str.matches("h+"));
        System.out.println(str.matches("h?"));
        Pattern pt = Pattern.compile("h*");
        Pattern pt2 = Pattern.compile("h+");
        Pattern pt3 = Pattern.compile("h?");
        Matcher mathcer = pt.matcher(str);
        Matcher mathcer2 = pt2.matcher(str);
        Matcher mathcer3 = pt3.matcher(str);
        while (mathcer.find()) {
            System.out.println("Паттерн h*: " + mathcer.find()); //find возвращает true на каждой итерации,
        }                                                 //т.к. * подразумевает 0 и более символов. В нашем случае 0.
        while (mathcer2.find()) {
            System.out.println("Паттерн h+: " + mathcer2.find());//ни один символ не соответсвует паттерну,
        }                                                 // т.к. + подразумевает 1 и более симоволов. В нашем случае 0.
        while (mathcer3.find()) {
            System.out.println("Паттерн h?: " + mathcer3.find());//каждый символ строки соответсвует паттерну,
        }                                                 //т.к. * подразумевает 0 или 1 символ. В нашем случае 0.
        System.out.println("");


        FindWithMatcherFind finderMatcherFind = new FindWithMatcherFind();
        finderMatcherFind.finder();

        FindWithSplitMatches finderSplitMatches = new FindWithSplitMatches();
        finderSplitMatches.finder();

    }

}
