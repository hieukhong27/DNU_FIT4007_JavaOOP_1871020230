package part1.basic.variables;
import java.util.Scanner;

public class Example05StudentAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số tổi của sinh viên: ");
        int age = sc.nextInt();

        int yearofbirth = 2023 - age;

        System.out.print("Năm sinh của sinh viên: " + yearofbirth);
    }
}
