import java.io.*;

public class WriteBinnaryChat implements ISaverChat{
    @Override
    public void showChat(Chat chat){
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("chatlogbinnary.txt"))){
            for (int i = 0; i < chat.getMessages().size() ; i++) {
             //  byte[] bytes = (chat.getMessages().get(i).toString()).getBytes();
                char [] chars = chat.getMessages().get(i).toString().toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    oos.writeObject(Integer.toBinaryString(chars[j]));
                }
//               String s = new String(bytes);
//               String z = Integer.toBinaryString()
//               oos.writeObject(s);
//                System.out.println(s);
//              for (int j = 0; j < bytes.length ; j++) {
//                    oos.write(bytes[j]);
//                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
