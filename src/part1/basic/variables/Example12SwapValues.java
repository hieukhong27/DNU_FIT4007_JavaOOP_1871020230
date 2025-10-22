package part1.basic.variables;

import java.util.Scanner;

public class Example12SwapValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        int a = sc.nextInt();
        System.out.print("Nhập giá trị b: ");
        int b = sc.nextInt();

        a = a - b;
        b = b + a;
        a = b - a;
        System.out.print("Gía trị a là: " + a + "\n");
        System.out.print("Gía trị b là: " + b);

    }
}
