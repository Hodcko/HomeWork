import javafx.scene.input.InputMethodTextRun;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regulars {
    public static void main(String[] args) {
        System.out.println("20934".matches("-?[0-9]+"));
        String str = "Test    string for split";
        String[] words = str.split(" +");
        for (String word : words) {
            System.out.println(word + " ");
        }

        String[] mails = new String[]{"hodckoq@gmail.com"};
        for (String mail : mails) {
            System.out.println("Мэйл " + mail + ". Результат проверки " + mail.matches("[a-zA-Z0-9]+@[a-zA-Z0-9.]+"));
        }

        String message = "Мама мыла раму. Мама готовира борщ.";
        Pattern pt = Pattern.compile("Мама");
        Matcher mathcer = pt.matcher(message); //mathcer всегда новый, создается через pattern
        while (mathcer.find()) {
            System.out.println(mathcer.start());
        }

        String urls = "https://tut.byhttp://onliner.byttps://hell";
        Pattern pattern = Pattern.compile("(http|https)://[a-zA-Z]+.([a-zA-Z]{2})");
        Matcher matcher = pattern.matcher(urls);

        Map<String, Integer> protocols = new HashMap<>();
        Map<String, Integer> zones = new HashMap<>();

        while (matcher.find()) {
            incrementer(matcher.group(1), protocols);
            incrementer(matcher.group(2), zones);
        }

        printMap(protocols);
        printMap(zones);
    }

    public static void incrementer(String key, Map<String, Integer> data) {
        if (!data.containsKey(key)) {
            data.put(key, 1);
        } else {
            data.put(key, data.get(key) + 1);
        }
    }

    public static void printMap(Map data) {
        for (Object key : data.keySet()) {
            System.out.println("Key: " + key + " Value: " + data.get(key));
        }


    }
}
