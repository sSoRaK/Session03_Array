import java.util.Scanner;

public class TienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền cho vay: ");
        int amount = scanner.nextInt();
        System.out.print("Nhập lãi suất theo năm: ");
        double rateYear = scanner.nextDouble();
        System.out.print("Số tháng cho vay: ");
        short month = scanner.nextShort();
        double interestAmount = 0;
        for (int i = 0; i < month; i++) {
            interestAmount = amount * ((rateYear / 100) / 12) * month;
        }

        System.out.printf("Số tiền lãi cho vay trong %d tháng, lãi suất %f trong 1 năm là: %f\n", month, rateYear, interestAmount);
    }
}
