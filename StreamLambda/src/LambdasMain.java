public class LambdasMain {
    public static void main(String[] args) {
        FuncInter funcInter = () -> 2;
        System.out.println(funcInter.getValue());

//        AnonInterface anon = new AnonInterface() {
//            @Override
//            public void getName() {
//                System.out.println("Привет");
//            }
//
//            @Override
//            public  void getValue() {
//                System.out.println("Hello");
//            }
//        };
//        anon.getName();
//        anon.getValue();
//
//        System.out.println(funcInter);
//        System.out.println(anon);



    }
}
