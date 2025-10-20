package part1.basic.variables;
import java.util.Scanner;

public class Example01SumDiffProductQuotient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.println("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        int total = a + b;
        int quotient = a - b;
        double remainder =(double) a / b;
        long multiplication =(long) a * b;

        System.out.println("\n--- Kết quả phép tính ---");
        System.out.println("Tổng kết quả là: " + total);
        System.out.println("Hiệu kết quả là: " + quotient);
        if (b == 0) {
            System.out.println("Thương của a và b không chia được cho 0");
        }
        else
            System.out.println("Thương kết quả là: " + remainder);

        System.out.println("Tích kết quả là: " + multiplication);

    }
}
