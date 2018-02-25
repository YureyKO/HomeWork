package week1;

import java.util.Scanner;

/*
13. Дано натуральне число А > 1. Вирахувати яким по рахунку числом Фібоначі воно являється.
  Тобто введіть так число n , щоб φn=A.Якшо А не являєтся числом Фібоначі, виведіть число -1.
 */
public class task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number  - ");
        int numFn = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;
        int num3 = num1 + num2;

        if (numFn == num1) {
            System.out.print(num1);

        } else if (numFn == num2) {
            System.out.print(num1 + " " + num2 + " ");

        } else {
            System.out.print(num1 + " " + num2 + " ");
            for (int i = 3; numFn <= num3; i++)
                System.out.print(num3 + " ");
                num1 = num2;
            num2 = num3;;
        }


//
//        for (int i = 3; numFn <= num3; i++) {
//            // int num3 = num1 + num2;
//            if (num3 == numFn) {
//                break;
//
//            } else {
//                System.out.print(-1);
//            }
//            System.out.print(num3 + " ");

    }
}

