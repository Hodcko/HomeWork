
import java.io.IOException;
import java.util.Date;
import java.util.Map;

public class MessagerMain {
    public static void main(String[] args) throws ValidationExceptions, IOException{

        Registration registration = new Registration();
        ChatLoader chatLoader = new ChatLoader();
        chatLoader.load(registration);
//
//        User myUser1 = registration.createUser("hodcko@qgmail.com", "s+hjdgh");
//        User myUser2 = registration.createUser("hollabola@gmail.com", "fk3d0+d");
//        User myUser3 = registration.createUser("helloworld@gmail.com", "fz3d0+3");

        Chat myChat = Chat.newChat(registration.getUserMap().get("hodcko@qgmail.com"), registration.getUserMap().get("hollabola@gmail.com"));
        myChat.addMessage(new Message<>(registration.getUserMap().get("hodcko@qgmail.com"), MessageType.TEXT, new Date(), "Hello world"));
        myChat.addMessage(new Message<>(registration.getUserMap().get("hollabola@gmail.com"), MessageType.TEXT, new Date(), "Hello world!!!"));

        WriterChat write = new WriterChat();
        write.showChat(myChat);

        WriteBinnaryChat writeBinnaryChat = new WriteBinnaryChat();
        writeBinnaryChat.showChat(myChat);

        chatLoader.save(registration);

        System.out.println(registration.getUserMap());
    }
}
