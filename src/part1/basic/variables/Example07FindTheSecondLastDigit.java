package part1.basic.variables;

import java.util.Scanner;

public class Example07FindTheSecondLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int N = sc.nextInt();

        if (N <= 10){
            System.out.print("Số nguyên phải nhập tối thiểu số có 2 chữ số");
            return;
        }

        int TheSecondLastDigit01 = Math.abs(N / 10);
        int TheSecondLastDigit02 = TheSecondLastDigit01 % 10;

        System.out.print("Chữ số gần cuối của số nguyên đã nhập là: " + TheSecondLastDigit02);
    }
}
