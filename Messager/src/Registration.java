import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Registration implements Serializable {

    private Map<String, User> userMap = new HashMap<>();

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public  User createUser(String name, String password) throws ValidationExceptions {
        if(Validation.validateName(name)){
        }
        if(Validation.validatePassword(password)){
        }
        System.out.println("User is created");
        return this.registrator(name, password);
    }

    public  User registrator(String name, String password) throws ValidationExceptions {
        if(!(this.userMap.containsKey(name))) {
            Random random = new Random();
            int id = random.nextInt(100000);
            this.userMap.put(name, new User(id, name, password));
            return new User(id, name, password);
        }
        else{
            throw new ValidationExceptions("Пользователь с таким именем уже зарегистрирован");
        }
    }
}
