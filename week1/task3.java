package week1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /*Користувач вводить число. Вивести на екран його подвоєне значення, якшо число ділиться на 7 без залишку.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number - ");
        int num = scanner.nextInt();

        if (num % 7 == 0) {
            System.out.println(num * 2);
        }
    }
}