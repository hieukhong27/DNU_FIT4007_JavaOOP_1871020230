package part2.conditional.statements;

import java.util.Scanner;

public class Example06Triangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();
        System.out.print("Nhập số nguyên c: ");
        int c = sc.nextInt();

        if(a + b > c && a + c > b && b + c > a){
            System.out.print("Đây có thể là hình tam giác");
        }
        else if(a + b < c && a + b < c && b + c < a){
            System.out.print("Đây không thể là hình tam giác");
        }
    }
}
