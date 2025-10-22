package part2.conditional.statements;

import java.util.Scanner;

public class Example08IntergerCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("--- KIỂM TRA SỐ THỰC CÓ PHẢI SỐ NGUYÊN HAY KHÔNG ---");
        System.out.print("Nhập một số thực bất kì: ");
        double f = sc.nextDouble();

        int n = (int) f;

        if (n == f) {
            System.out.print("Số vừa nhập là số nguyên");
        }
        else {
            System.out.print("Số vừa nhập không phải số nguyên");
        }
    }
}
