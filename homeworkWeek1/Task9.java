package homeworkWeek1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /** Порахувати скільки разів зустрічається 5 в заданому числі, яке вводить користувач
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number1 - ");
        int num1 = scanner.nextInt();

        int sum = 0;
        while (num1 > 0) {
            if (num1 % 10 == 5) {
                sum = sum + 1;
            }
            num1 = num1 / 10;
        }
        System.out.println(sum);

    }
}