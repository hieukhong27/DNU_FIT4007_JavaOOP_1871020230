package part1.basic.variables;

import java.util.Scanner;

public class Example09SinglePrintDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        if (b==0){
            System.out.println("Không có số nào chia hết cho 0");
            return;
        }

        double c =(double) a / b;
        System.out.println("Kết quả của "+ a +" chia " +b + " là: " + c);
    }
}
