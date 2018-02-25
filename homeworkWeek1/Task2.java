package homeworkWeek1;

import java.util.Scanner;

public class Task2 {
    /*Користувач вводить три числа з консолі - потрібно вивести на консоль найбільше і найменше.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number1 - ");
        int num1 = scanner.nextInt();
        System.out.print("Enter your Number2 - ");
        int num2 = scanner.nextInt();
        System.out.print("Enter your Number3 - ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Number1 is MAX ");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number2 is MAX ");
        } else if (num3 > num2 && num3 > num1) {
            System.out.println("Number3 is MAX ");
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("Number1 is MIN ");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Number2 is MIN ");
        } else if (num3 < num2 && num3 < num1) {
            System.out.println("Number3 is MIN");
        }

    }
}
