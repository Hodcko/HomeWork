import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class ControlOperatorsIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String name = in.nextLine();
        if (name.equals("Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }else{
            if (name.equals("Анастасия")){
                System.out.println("Я тебя так долго ждал");
            }
            else{
                System.out.println("Добрый день, а вы кто?");
            }
        }
    }
}
