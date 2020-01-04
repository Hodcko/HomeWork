package api;


import ClassWorkAnnotation.IVersion;

public class Calculator {

    private int result;

    @IVersion(info = "3.5.3")
    public int addition (int firstNumber, int secondNumber){
        result = firstNumber + secondNumber;
        System.out.printf("The result of the addition %d and %d is %d\n", firstNumber, secondNumber, result);
        return result;
    }

    public int subtraction(int firstNumber, int secondNumber){
        result = firstNumber - secondNumber;
        System.out.printf("The result of the subtraction %d and %d is %d\n", firstNumber, secondNumber, result);
        return result;
    }

    public int multiplication(int firstNumber, int secondNumber){
        result = firstNumber * secondNumber;
        System.out.printf("The result of the multiplication %d and %d is %d\n", firstNumber, secondNumber, result);
        return result;
    }

    public int division(int firstNumber, int secondNumber){
        if (secondNumber == 0){
            throw new IllegalArgumentException("Cannot be divided by zero");
        }else {
            result = firstNumber / secondNumber;
            System.out.printf("The result of the division %d and %d is %d\n", firstNumber, secondNumber, result);
            return result;
        }
    }
}
