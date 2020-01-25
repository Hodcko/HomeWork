import java.util.*;

public class Chat{

    private Set<User> users;
    private List<Message> messages = new ArrayList<>();

    public Set<User> getUsers() {
        return users;
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
        this.users = users;
    }

}
