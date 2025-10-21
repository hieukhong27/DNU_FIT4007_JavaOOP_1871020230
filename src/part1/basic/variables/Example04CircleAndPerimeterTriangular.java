package part1.basic.variables;
import java.util.Scanner;

public class Example04CircleAndPerimeterTriangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh thứ nhất: ");
        double a = sc.nextDouble();
        System.out.print("Nhập cạnh thứ hai: ");
        double b = sc.nextDouble();
        System.out.print("Nhập cạnh thứ ba: ");
        double c = sc.nextDouble();

        if (a + b > c | a + c > b | b + c > a) {
            double Perimeter = a + b + c;
            double p = Perimeter / 2;

            double Area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            if (a <= 0 | b <= 0 | c <= 0) {
                System.out.print("Không nhận giá trị nhỏ hơn hoặc bằng 0.");
            }
            else {
                System.out.print("--- Kết quả chu vi và diện tích tam giác ---\n");
                System.out.print("Diện tích tam giác: " + Math.round(Area) + "\n");
                System.out.print("Chu vi tam giác: " + Math.round(Perimeter) + "\n");
            }
        }
        else {
            System.out.print("Không thỏa mãn điều kiện");
        }
    }
}
