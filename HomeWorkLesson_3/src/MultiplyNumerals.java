
public class MultiplyNumerals {
    public static void main(String[] args) {
        int number = 1;
        for (String num : args) {
            number = Integer.parseInt(num);
        }
        int mult = 1;
        int numeral;
        int numberOfNumeral = 0;
        while (number != 0) {
            numeral = number % 10;
                mult *= (number % 10);
                number /= 10;
                numberOfNumeral++;
                System.out.println(numberOfNumeral + " цифра числа: " + numeral);
                if (mult == numeral) {
                    continue;
                }
                System.out.println("произведение: " + mult);
            }
        }
    }
