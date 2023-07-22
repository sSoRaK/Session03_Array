import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập 1 số nguyên dương: ");
        boolean checkPrime = true;
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.printf("%d không phải là số nguyên tố\n", number);
            checkPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.printf("%d không phải là số nguyên tố\n", number);
                    checkPrime = false;
                    break;
                }
            }
            if (checkPrime) {
                System.out.printf("%d là số nguyên tố\n", number);
            }
        }
    }
}
