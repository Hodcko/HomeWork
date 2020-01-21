import src.GSM;
import src.ITel;
import src.Smart;
import src.Telefon;

public class ClassWork5 {
    public static void main(String[] args) {
        Telefon oldPhone = new Telefon();
        GSM gsmPhone  = new GSM();
        ITel smartPhone = new Smart();
        ITel oldphone2 = new Telefon();
        oldPhone.call();
        gsmPhone.call();
        smartPhone.call();
//        smartPhone.call("860010");
//        smartPhone.pause();
        ((Telefon)oldphone2).stop();//переменная Itel, нужно обратиться к ней как к переменной Telephone
        oldPhone.stop();
        ((Smart) smartPhone).music();





    }

}
