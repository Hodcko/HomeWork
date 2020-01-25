import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class User {
    private int id;
    private String name;
    private String password;

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public static Map<String, User> userMap = new HashMap<>();

    public static User createUser(String name, String password) throws ValidationExceptions {
        if(Validation.validateName(name)){
        }
        if(Validation.validatePassword(password)){
        }
        System.out.println("User is created");
        return Registration.registrator(name, password);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
