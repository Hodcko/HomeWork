import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class IOMain {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream("text_file.txt", true));
            writer.println("Привет запись в файл");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
