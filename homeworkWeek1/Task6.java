package homeworkWeek1;

import java.util.Scanner;

/*
Вводимо два числа. Виводимо їх додаток, якшо він в діапазоні від 11 до 19
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number1 - ");
        int num1 = scanner.nextInt();
        System.out.print("Enter your Number2 - ");
        int num2 = scanner.nextInt();

        if (num1 >= 11 && num1 <= 19 && num2 >= 11 && num2 <= 19) {
            System.out.println(num1 + num2);
        }
    }
}

