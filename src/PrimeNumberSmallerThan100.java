import java.util.Scanner;

public class PrimeNumberSmallerThan100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100:");
        int number = 2;
        while (number < 100) {
            boolean checkPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    checkPrime = false;
                    break;
                }
            }
            if (checkPrime) {
                System.out.printf("%d\t", number);
            }
            number++;
        }
    }
}
