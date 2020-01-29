import java.io.*;
import java.util.List;

public class WriteBinnaryChat implements ISaverChat{
    @Override
    public void showChat(Chat chat)  {
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("chatlogbinnary.txt"))){
            oos.writeObject(chat.getMessages());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
