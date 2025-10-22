package part2.conditional.statements;

import java.util.Scanner;

public class Example04MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        if(a > b){
            System.out.print(a + " lớn hơn" + b);
        }
        else if(b > a){
            System.out.print(b + " lớn hơn "+ a);
        }
        else if(a == b){
            System.out.print("Hai số nguyên a và b bằng nhau");
        }
    }
}
