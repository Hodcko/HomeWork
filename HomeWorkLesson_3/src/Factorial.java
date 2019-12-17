
public class Factorial {
    public static void main(String[] args) {
        int number = 1;
        for(String num : args){
            number = Integer.parseInt(num);
        }
        int fact = 1;
        for (int i = 1; i <= number; i ++){
            fact *=i;
        }
        System.out.println("Результат равен: "+fact);
    }
}
