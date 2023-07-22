import java.util.Scanner;

public class Display20PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int n = 2;
        while (count < number) {
            boolean checkPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 2) {
                    checkPrime = false;
                    break;
                }
            }
            if (checkPrime) {
                System.out.printf("%d\t", n);
                count++;
            }
            n++;
        }
    }
}
