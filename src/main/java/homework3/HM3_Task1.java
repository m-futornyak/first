package homework3;

import java.util.Scanner;

/**
 * Created by mfutornyak on 03.06.2018.
 */
/*
Задача 1.
Пользователь вводит последовательность символов.
Программа должна определить, является ли последовательность палиндромом.
Вывести ДА, если последовательность символов палиндром и НЕТ в противном случае. */


public class HM3_Task1 {
    public static void main(String[] args) {
        System.out.printf("Введите последовательность символов: ");
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        StringBuilder p = new StringBuilder(a);
        p.reverse();
        System.out.println(p);
        boolean  compare = a.equals(p.toString());
        System.out.println(compare);
    }
}
