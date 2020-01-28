import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Seri {
    public static void main(String[] args) throws IOException {
        User user = new User(11, "d", "ass");
        List<User>  users = new ArrayList<>();
        users.add(user);
        OutputStream stream = new FileOutputStream("serilize.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);
        objectOutputStream.writeObject(users);// вне resourses
        objectOutputStream.close();
    }

}
