import java.io.*;
import java.util.List;

public class WriteBinnaryChat {
    public void showBinnaryChat(Chat chat) throws IOException {
        //List<Message> list = chat.getMessages();
        OutputStream stream = new FileOutputStream("chatlogbinnary.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);
        //objectOutputStream.writeObject(list);
        for (int i = 0; i < chat.getMessages().size() ; i++) {
            objectOutputStream.writeBytes((chat.getMessages().get(i)).toString());

        }

        objectOutputStream.close();
    }
}
