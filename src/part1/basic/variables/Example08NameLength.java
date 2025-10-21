package part1.basic.variables;

import java.util.Scanner;

public class Example08NameLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên đầy đủ của bạn(nhập tên không cách): ");
        String fullname = sc.nextLine();

        int length = fullname.length();

        System.out.print("Độ dài họ và tên của bạn " + length + " kí tự.");
    }
}
