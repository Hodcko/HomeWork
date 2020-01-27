import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static boolean validateName(String name) throws ValidationExceptions {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9.]+");
        Matcher mathcer = pattern.matcher(name);
        if (mathcer.find()) {
        }
        else{
            throw new ValidationExceptions("Имя должно быть @mail");
        }
        return true;
    }

    public static boolean validatePassword(String password) throws ValidationExceptions {
        char[] str = password.toCharArray();
        for (int i = 1; i <= str.length - 1; i ++){
            if(str[i - 1] == str[i]){
                throw new ValidationExceptions("В вашем пароле два повторяющихся символа " + str[i] + " под ряд");
            }
        }
        Pattern pattern = Pattern.compile("([а-яА-Яa-zA-Z0-9](?=.*[':/!?+%]).{6,})");
        Matcher mathcer = pattern.matcher(password);
        if (mathcer.find()) {
        }
        else{
            throw new ValidationExceptions("Пароль должен быть не короче 7 символов и иметь " +
                    "как минимум один символ из ':/!?+%");
        }
        return true;
    }
}
