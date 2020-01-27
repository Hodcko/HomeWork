import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Registration {

    private static Map<String, User> userMap = new HashMap<>();

    public static User createUser(String name, String password) throws ValidationExceptions {
        if(Validation.validateName(name)){
        }
        if(Validation.validatePassword(password)){
        }
        System.out.println("User is created");
        return Registration.registrator(name, password);
    }

    public static User registrator(String name, String password) throws ValidationExceptions {
        if(!(Registration.userMap.containsKey(name))) {
            Random random = new Random();
            int id = random.nextInt(100000);
            Registration.userMap.put(name, new User(id, name, password));
            return new User(id, name, password);
        }
        else{
            throw new ValidationExceptions("Пользователь с таким именем уже зарегистрирован");
        }
    }
}
