package part1.basic.variables;

import java.util.Scanner;

public class Example06FindTheLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int N = sc.nextInt();

        int TheLastDigit = Math.abs(N % 10);
        System.out.print("Chữ số cuối cùng của số nguyên là: " + TheLastDigit);
    }
}
