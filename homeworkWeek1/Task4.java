package homeworkWeek1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Вводимо число з плаваючою точкою і перевіряємо чи це число в діапазоні від 0 до 1.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your FloatingNumber - ");
        float num = scanner.nextFloat();


        if (num > 0 && num < 1) {
            System.out.println("So good");
        }
    }
}
