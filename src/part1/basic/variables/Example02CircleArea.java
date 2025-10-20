package part1.basic.variables;
import java.util.Scanner;

public class Example02CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Bài toán tính diện tích và chu vi hình tròn ---");
        System.out.println("Nhập bán kính hình tròn: ");
        double R = sc.nextDouble();
        sc.close();

        final double PI = Math.PI;

        double ChuViHinhTron = 2*PI*R;
        double DienTichHinhTron = 2*PI*R*R;

        System.out.println("Kết quả chu vi và diện tích");
        System.out.println("Chu vi hình tròn là: " + Math.round(ChuViHinhTron));
        System.out.println("Diện tích hình tròn là: " + Math.round(DienTichHinhTron));
    }
}
