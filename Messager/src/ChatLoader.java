
import java.io.*;
import java.util.Map;

public class ChatLoader {
    public void save(Registration registration)  {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("chatusers.txt"));) {
            oos.writeObject(registration.getUserMap());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(Registration registration) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("chatusers.txt"))) {
            registration.setUserMap((Map<String, User>) ois.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
