package part2.conditional.statements;

import java.util.Scanner;

public class Example10UocVaBoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên dương b: ");
        int b = sc.nextInt();
        System.out.print("Nhập số nguyên dương c: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            if (a % b == 0 && b % c == 0) {
                System.out.print("Số nguyên dương " + b + " là ước của " + a + " đồng thời là bội của " + c);
            }
            else {
                System.out.print("Số nguyên dương " + b + " không là ước của " + a + " đồng thời không là bội của " + c);
            }
        }
        else {
            System.out.print("Không nhập đúng yêu cầu");
        }
    }
}
