package homeworkWeek1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        /*Вводимо 2 числа. Якшо перше число більше другого, то виводимо на консоль різницю цих чисел.
          В іншому випадку то виводимо добуток
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number1 - ");
        int num1 = scanner.nextInt();
        System.out.print("Enter your Number2 - ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 - num2);
        } else {
            System.out.println(num1 * num2);
        }
    }
}


