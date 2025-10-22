package part2.conditional.statements;

import java.util.Scanner;

public class Example01NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("--- Bài toán kiểm tra số tự nhiên ---\n");
        System.out.print("Nhập một số nguyên bất kì: ");
        int a = sc.nextInt();

        if (a < 0){
            System.out.print("Số" + a + " là số nguyên âm. Không phải số tự nhiên!!");
        }
        else {
            System.out.print("Số" + a + " là số tự nhiên.");
        }
    }
}
