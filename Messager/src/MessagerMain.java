
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MessagerMain {
    public static void main(String[] args) {
        User user1 = new User(123, "Bob@mail.ru", "qwerty");
        User user2 = new User(321, "John@rambler.ru", "12345");
        Set<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);
        Chat chat = new Chat(users);
        chat.addMessage(new Message<>(user1, MessageType.TEXT, new Date(), "Hello"));
        chat.addMessage(new Message<>(user2, MessageType.TEXT, new Date(),"Hello world"));
        ISaverChat saver = new SaverChat();
        saver.showChat(chat);

    //валидация и регистрация

    }
}
