import java.util.List;

public class PrintChat implements ISaverChat {

    @Override
    public void showChat(Chat chat) {
        List<Message> list = chat.getMessages();
        for (Message message : list) {
            System.out.println(message);
        }
    }
}
