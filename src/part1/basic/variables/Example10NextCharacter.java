package part1.basic.variables;

import java.util.Scanner;

public class Example10NextCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chữ cái thường từ a đến z: ");
        char H = sc.next().charAt(0);

        if (H >= 'a' && H <= 'z') {
            char N = (char) (H + 1);

            System.out.print("Chữ cái liền sau của " + H + " là: " + N);
            return;
        }
    }
}
