import java.io.*;


public class WriteBinnaryChat implements ISaverChat{
    @Override
    public void showChat(Chat chat)  {
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("chatlogbinnary.txt"))){
            for (int i = 0; i < chat.getMessages().size() ; i++) {
                oos.writeBytes((chat.getMessages().get(i)).toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
