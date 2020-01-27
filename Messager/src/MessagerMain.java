
import java.util.Date;

public class MessagerMain {
    public static void main(String[] args) throws ValidationExceptions {

        User myUser1 = Registration.createUser("hodcko@qgmail.com", "s+hjdgh");
        User myUser2 = Registration.createUser("hollabola@gmail.com", "fk3d0+d");

        Chat myChat = Chat.newChat(myUser1, myUser2);
        myChat.addMessage(new Message<>(myUser1, MessageType.TEXT, new Date(), "Hello world"));
        myChat.addMessage(new Message<>(myUser2, MessageType.TEXT, new Date(), "Hello world!!!"));
        ISaverChat saver = new SaverChat();
        saver.showChat(myChat);
    }
}
