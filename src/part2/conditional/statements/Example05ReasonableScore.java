package part2.conditional.statements;

import java.util.Scanner;

public class Example05ReasonableScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm số hợp lí của học sinh: ");
        float score = sc.nextInt();

        if (score >= 0  && score <= 10) {
            System.out.print("Điểm số hợp lí");
        }
        else{
            System.out.print("Điểm số không hợp lí");
        }
    }
}
