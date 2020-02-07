public class LambdasMain2 {
    public static void main(String[] args) {
        FunkInter2 funkInter2 = (b, c) -> b + c;
        System.out.println(funkInter2.plus(1,5));
    }
}
