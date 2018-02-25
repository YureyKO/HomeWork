package week1;

import java.util.Scanner;

/*
 * 12. Вирахувати число фібоначі по номеру послідовності, який вводить користувач.
 * φ0=0,  φ1=1, ..., φn=φn-1+φn-2.
 * По даному числу n вирахувати n-є число Фібоначі φn.
 */
public class task12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the FIBOUS number - ");
        int numF = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + " " + num2 + " ");
        for (int i = 3; i <= numF; i++) {
            int num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}
