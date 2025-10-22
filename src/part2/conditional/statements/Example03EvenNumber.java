package part2.conditional.statements;

import java.util.Scanner;

public class Example03EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();

        if (a % 2 == 0){
            System.out.print("số chẵn");
        }
        else if (a % 2 == 1){
            System.out.print("Số lẻ");
        }
    }
}
