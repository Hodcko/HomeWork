package ClassesAndInterfaceses;
import ClassesAndInterfaceses.api.Body;
import ClassesAndInterfaceses.api.Hands;
import ClassesAndInterfaceses.api.Head;
import ClassesAndInterfaceses.api.Legs;

public class RobotMain{
    public static void main(String[] args) {

        Hands myHands = new Hands(4);
        Legs myLegs = new Legs(4);
        Head myHead = new Head("Blue");
        Body myBody = new Body("Yasya");

        MyRobot vasya = new MyRobot(myHead, myBody, myLegs, myHands);

        vasya.look();
        vasya.toKeep();
        vasya.walk();
     






    }




}
