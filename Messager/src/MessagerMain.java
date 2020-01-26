
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MessagerMain {
    public static void main(String[] args) throws ValidationExceptions {

        User myUser1 = User.createUser("hodcko@qgmail.com", "s+jhghzl");
        User myUser2 = User.createUser("hollabola@gmail.com", "fk3d0+dd");

        System.out.println(User.userMap);
        System.out.println(User.userMap.size());
        Chat.addUser(myUser1);
        Chat.addUser(myUser2);

        Chat myChat = Chat.newChat();
        myChat.addMessage(new Message<>(myUser1, MessageType.TEXT, new Date(), "Hello world"));
        myChat.addMessage(new Message<>(myUser2, MessageType.TEXT, new Date(), "Hello world!!!"));
        ISaverChat saver = new SaverChat();
        saver.showChat(myChat);






    }
}
