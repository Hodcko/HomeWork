import java.io.*;

public class WriteBinnaryChat implements ISaverChat{
    @Override
    public void showChat(Chat chat){
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("chatlogbinnary.txt"))){
            for (int i = 0; i < chat.getMessages().size() ; i++) {
                char [] chars = chat.getMessages().get(i).toString().toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    oos.writeObject(Integer.toBinaryString(chars[j]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
