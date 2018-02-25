package week1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        /*Користувач вводить цілочисельний тип з консолі (час від 0 до 24)
         *Якшо час від 9 до 18 - вивлдимо на консль "I am at work", в іншому випадку "I rest"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your time at 0 to 24: ");
        int time = scanner.nextInt();


        if (time > 9 && time < 18) {
            System.out.print("I am at work");

        } else if (0 <= time && time <= 9 || time >= 18 && time <= 24) {
            System.out.print("I rest");

        } else {
            System.out.print("INCORRECT time");
        }
    }
}