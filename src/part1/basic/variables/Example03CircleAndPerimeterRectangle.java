package part1.basic.variables;
import java.util.Scanner;

public class Example03CircleAndPerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Bài toán tính diện tích và chu vi hình chữ nhật ---");

        System.out.println("Nhập chiều dài hình chữ nhật: ");
        float Length = sc.nextFloat();

        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        float Width = sc.nextFloat();

        float Area = Length * Width;
        float Perimeter = (Length + Width) * 2;

        if (Length <= 0 || Width <= 0) {
            System.out.print("Chiều dài và chiều rộng không nhỏ hơn hoặc bằng 0!!");
        } else {
            System.out.print("-------------------\n");
            System.out.print("Diện tích là: " + Area + "\n");
            System.out.print("Chu vi là: " + Perimeter + "\n");
            System.out.println("-----------------");
        }
    }
}
