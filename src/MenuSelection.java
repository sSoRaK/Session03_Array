import java.util.Scanner;

public class MenuSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**********MENU**********");
            System.out.println("1. Vẽ hình vuông");
            System.out.println("2. Vẽ hình chữ nhật");
            System.out.println("3. Vẽ hình tam giác");
            System.out.println("4. Thoát");
            System.out.printf("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Vẽ hình vuông");
                    System.out.println("* * *");
                    System.out.println("* * *");
                    System.out.println("* * *");
                    break;
                case 2:
                    System.out.println("2. Vẽ hình chữ nhật");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 3:
                    System.out.println("3. Vẽ hình tam giác");
                    System.out.println("* * * *");
                    System.out.println("* * *");
                    System.out.println("* *");
                    System.out.println("*");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Nhập lại lựa chọn 1 - 4");
            }
        } while (true);
    }
}
