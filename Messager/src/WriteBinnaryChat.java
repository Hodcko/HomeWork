import java.io.*;
import java.util.Arrays;

public class WriteBinnaryChat implements ISaverChat{
    @Override
    public void showChat(Chat chat){
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("chatlogbinnary.txt"))){
            char[] chars = chat.getMessages().toString().toCharArray();
            oos.writeInt(chars.length);
            for (int i = 0; i < chars.length; i++) {
                oos.writeObject(Integer.toBinaryString(chars[i]));
            }
            System.out.println(chat.getMessages());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showChatFromBinaryFile(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("chatlogbinnary.txt"))) {
            int size = ois.readInt();
            char [] chars = new char[size];
            for (int i = 0; i < size; i++) {
                chars[i] = (char)Integer.parseInt((String)ois.readObject(), 2);
            }
            String str = new String(chars);
            System.out.println(str);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
