package week1;

import java.util.Scanner;

public class task11 {
    /*
     * Вирахувати факторіал числа, яке вводить користувач.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число  ФАКТОРІАЛА - ");
        int numF = scanner.nextInt();

        int resF = 1;

        for (int i = 1; i <= numF; i++) {
            resF = resF * i;
        }
        System.out.print(resF);

    }
}
