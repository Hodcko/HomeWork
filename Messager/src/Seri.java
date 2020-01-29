import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Seri {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User(11, "f", "ass");
        List<User>  users = new ArrayList<>();
        users.add(user);
        OutputStream stream = new FileOutputStream("serilize.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);
        objectOutputStream.writeObject(users);// вне resourses
        objectOutputStream.close();

        InputStream is = new FileInputStream("serilize.txt");
        ObjectInputStream ois = new ObjectInputStream(is);
        List userList = (List)ois.readObject();
        ois.close();
        System.out.println(userList);
    }

}
