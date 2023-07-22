import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số b: ");
        int b = Integer.parseInt(scanner.nextLine());
        // Sử dụng hàm abs() để trả giá trị tuyệt đối a, b 
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.println("Hai số không có ước chung lớn nhất");
        } else if (a == 0) {
            System.out.printf("Ước chung lớn nhất của 2 số là: %d\n", b);
        } else if (b == 0) {
            System.out.printf("Ước chung lớn nhất của 2 số là: %d\n", a);
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.printf("Ước chung lớn nhất của 2 số là: %d\n", a);
        }
    }
}
