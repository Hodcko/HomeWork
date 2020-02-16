import com.sun.corba.se.spi.ior.ObjectKey;

public class Radio implements Electricity{
    public void playMusic(){
        System.out.println("Музыка играет");
    }

    @Override
    public void electricityOn(Object object) {
        playMusic();
    }
}
