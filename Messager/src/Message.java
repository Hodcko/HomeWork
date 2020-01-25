import java.util.Date;

public class Message<T> {
    User user;
    Enum type;
    Date date;
    T data;

    public Message(User user, Enum type, Date date, T data) {
        this.user = user;
        this.type = type;
        this.date = date;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Message{" +
                "user=" + user +
                ", type=" + type +
                ", date=" + date +
                ", data=" + data +
                '}';
    }
}
