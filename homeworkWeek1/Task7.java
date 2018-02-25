package homeworkWeek1;

import java.util.Scanner;

/*
Вводимо два числа, якшо одне з них ділить без залишку на інше, то виводимо true і показуємо результат ділення.
  В іншому випадку виводимо false і результат ділення (цілу частину і залишок).
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number1 - ");
        int num1 = scanner.nextInt();
        System.out.print("Enter your Number2 - ");
        int num2 = scanner.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.print(true);
        } else System.out.print(false);
    }
}
