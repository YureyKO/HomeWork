package week1;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        /*Вводимо два числа. Порівняти останні цифри цих чисел (користуємося оператором %)
      			124    4    -   true
     			1456   567  -   false
     			1      2    -   false
    			18     98   -   true
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number1 - ");
        int num1 = scanner.nextInt();
        System.out.print("Enter your Number2 - ");
        int num2 = scanner.nextInt();

        int res1 = num1 % 10;
        int res2 = num2 % 10;
        if (res1 == res2) {
            System.out.print(true);
        } else System.out.print(false);
    }
}
