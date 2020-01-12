public class Exception2_1 {
    //Задание 2.1
    public int squaring(int number) throws MyException, MyException2 {
        int result;
        if (number <= 0) {
            throw new MyException("Число должно быть больше нуля");
        } else {
            result = number * number;
            System.out.println(result);
        }
        return result;
    }
}





