package part2.conditional.statements;

import java.util.Scanner;

public class Example02Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        int a = sc.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = sc.nextInt();

        if (0 <= a || 0 <= b) {
            System.out.print("Cạnh a và b phải lớn hơn hoặc 0");
        }
        else {
            if (a == b) {
                System.out.print("Hình vuông");
            } else {
                System.out.print("hình chữ nhật");
            }
        }
    }
}
