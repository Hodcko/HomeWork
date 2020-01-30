import java.io.FileNotFoundException;
import java.io.IOException;

public interface ISaverChat {
    void showChat(Chat chat) throws FileNotFoundException, IOException, ClassNotFoundException;
}
