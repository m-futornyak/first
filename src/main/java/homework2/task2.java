package homework2;

import java.util.Scanner;

/**
 * Created by mfutornyak on 03.06.2018.
 */
/*

 /*
Задача 2.
        Есть целое положительное число (long). Программа должна определить сумму цифр из которых состоит число.
        Сумма цифр числа 15875 => 26
*/

public class task2 {
    public static void main(String[] args) {
        calculation();
    }

    public static void calculation() {
        System.out.printf("Введите целое положительное число типа long:");
        Scanner console = new Scanner(System.in);
        long n = console.nextInt();
        long sum = 0;
        if (n > 0) {
            do {
                sum = sum + n % 10;
                n = n / 10;
            } while (n > 0);
        System.out.printf("Сумма цифр числа = " + sum); }
    else{
            System.out.printf("Введенео не правильное число");
        }
    }
}
