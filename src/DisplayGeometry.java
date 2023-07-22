import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**********MENU**********");
            System.out.println("1. Vẽ hình chữ nhật");
            System.out.println("2. Vẽ hình tam giác vuông (Top-left)");
            System.out.println("3. Vẽ hình tam giác vuông (Top-right)");
            System.out.println("4. Vẽ hình tam giác vuông (Bottom-left)");
            System.out.println("5. Vẽ hình tam giác vuông (Bottom-right)");
            System.out.println("6. Vẽ hình tam giác cân");
            System.out.println("7. Thoát");
            System.out.printf("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Vẽ hình chữ nhật");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("* ");
                        for (int j = 0; j < 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 2:
                    System.out.println("2. Vẽ hình tam giác vuông (Top-left)");
                    for (int i = 5; i >= 0; i--) {
                        System.out.print("* ");
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 3:
                    System.out.println("3. Vẽ hình tam giác vuông (Top-right)");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = i; k < 5; k++) {
                            System.out.printf("*");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 4:
                    System.out.println("3. Vẽ hình tam giác vuông (Bottom-right)");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print(" ");

                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print("*");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 5:
                    System.out.println("3. Vẽ hình tam giác vuông (Bottom-left)");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("* ");
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 6:
                    System.out.println("3. Vẽ hình tam giác cân");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Nhập lại lựa chọn 1 - 7");
            }
        } while (true);
    }
}
