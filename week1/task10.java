package week1;
/*
Перевести чило з десятичної системи в двійкову і навпаки. Користувач вводить число
 */

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number1 - ");
        int num10 = scanner.nextInt();

        int res2 = 0, res10 = 0, num2 = 0;

        do {
            res2 = num10 % 2;
            num10 = num10 / 2;
            System.out.print(" " + res2);
        } while (num10 != 0);


    }


}
