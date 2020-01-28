
import java.util.*;

public class Chat{

    private  static Set<User> chatUsers = new HashSet<>();
    private List<Message> messages = new LinkedList<>();


    private Chat(Set<User> users) {
        chatUsers = users;
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
        List<Message> list = Arrays.asList(messagesArray);
        this.addMessage(list);
    }

    public void addMessage(List<Message> list){
        this.messages.addAll(list);
    }


    public static Chat newChat(User... user) throws ValidationExceptions {
        chatUsers.addAll(Arrays.asList(user));
        if(!(chatUsers.size() >= 2)){
            throw new ValidationExceptions("Недоставточно пользователей для создания чата");
        }
        return new Chat(chatUsers);
    }

}
