import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;

public class WriterChat implements ISaverChat{
    private String fileName;
    private FileOutputStream stream;

//    public WriterChat(String fileName){
//        try {
//            this.stream = new FileOutputStream(fileName);
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//    }
//
//    public WriterChat(FileOutputStream stream){
//        this.stream = stream;
//    }
//
//    public WriterChat(){
//        this("default_name.txt");
//    }



    @Override
    public void showChat(Chat chat) {
        try(PrintWriter writer = new PrintWriter(new FileOutputStream("chatlog.txt"))) {
            for (Message message : chat.getMessages())
                writer.println(message.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
