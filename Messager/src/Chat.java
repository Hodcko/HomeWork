import javax.jws.soap.SOAPBinding;
import java.util.*;

public class Chat{

    public static Set<User> users = new HashSet<>();
    private List<Message> messages = new ArrayList<>();

    public static void addUser(User user){
        users.add(user);
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void addMessage(Message message){
        Message[] messages = new Message[1];
        messages[0] = message;
        this.addMessage(messages);
    }

    public void addMessage(Message[] messagesArray){
        List<Message> list;
        list = Arrays.asList(messagesArray);
        this.addMessage(list);
    }

    public void addMessage(List<Message> list){
        messages.addAll(list);
    }


    public Chat(Set<User> users) {
        Chat.users = users;
    }

    public static Chat newChat() throws ValidationExceptions {
        if(!(users.size() >= 2)){
            throw new ValidationExceptions("Недоставточно пользователей для создания чата");
        }
        return new Chat(users);
    }

}
