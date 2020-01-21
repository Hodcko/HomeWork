package src;

public class Smart extends GSM{
    public void internet(){
        System.out.println("http");
    }

    public void music(){
        System.out.println("Играет");
    }

    @Override
    public void call(){
        this.call("911");
    }

    public void call(String number){
        this.call(number, false);

    }

    public void call(String number, boolean stopCall){
        System.out.println("Отклчить интернет");
        System.out.println("Набираю "+number+" Гудки");
        super.call();//обращене к родительскому классу
 //       super.pause();
 //       if(stopCall){
 //           System.out.println("Бросаю трубку");
 //       }
 //       System.out.println("Вклчить интернет");
    }


    public void call(boolean stopCall, String number){
        System.out.println("Отклчить интернет");
        System.out.println("Набираю "+number+" Гудки");
        if(stopCall){
            System.out.println("Бросаю трубку");
        }
        System.out.println("Вклчить интернет");
    }





}
