package part2.conditional.statements;

import java.util.Scanner;

public class Example15DongHo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số giờ(h): ");
        int h = sc.nextInt();
        System.out.print("Nhập sô phút(m): ");
        int m = sc.nextInt();

        if (0 <= h && h <= 24 | 0 <= m && m <= 60) {
            int n = m + 1;
            System.out.print("Thời gian hiện tại là" + h + ":" + m + " và thời gian sau 1 phút nữa là " + h + ":" +n);
        }
        else if (h < 0 ) {
            System.out.print("Số giờ nhập không hợp lệ");
        }
        else if (m < 0 ) {
            System.out.print("Số phút nhập không hợp lệ");
        }


    }
}
