public class Exception2_2 extends Exception2_1 {
    //Задание 2.2
    @Override
    public int squaring(int number) throws MyException, MyException2 {
        int result;
        if (number <= 0) {
            throw new MyException("Число должно быть больше нуля");
        } else {
            if(number > 100){
                throw new MyException2("Число должно быть меньше или равно 100");
            }else {
                result = number * number;
                System.out.println(result);
            }
        }
        return result;
    }
}
