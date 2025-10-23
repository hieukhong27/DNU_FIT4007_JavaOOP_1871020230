package part2.conditional.statements;

import java.util.Scanner;

public class Example09SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương N bất kì: ");
        long n = sc.nextLong();

        if (n > 0) {
            double CanSoN = Math.sqrt(n);

            long CanSoNguyen = (long) CanSoN;

            if (CanSoNguyen * CanSoNguyen == n) {
                System.out.print("Số " + n + " là số chính phương");
            }
            else {
                System.out.print("Số " + n + " Không phải số chính phương");
            }
        }
        else {
            System.out.print("Nhập sai yêu cầu");
        }
    }
}
