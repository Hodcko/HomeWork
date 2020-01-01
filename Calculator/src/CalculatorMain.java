
import api.Calculator;


public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.addition(25, -7);
        calculator.subtraction(34, 19);
        calculator.multiplication(33, 10);
        calculator.division(19, 9);
        calculator.division(22, 0);
    }
}
