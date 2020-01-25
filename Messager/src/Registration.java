import java.util.Random;

public class Registration {


    public static User registrator(String name, String password) throws ValidationExceptions {
        if(!(User.userMap.containsKey(name))) {
            Random random = new Random();
            int id = random.nextInt(100000);
            User.userMap.put(name, new User(id, name, password));
            return new User(id, name, password);
        }
        else{
            throw new ValidationExceptions("Пользователь с таким именем уже разеристрирован");
        }
    }

}
