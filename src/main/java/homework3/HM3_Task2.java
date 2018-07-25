package homework3;

import java.util.Scanner;

/**
 * Created by mfutornyak on 03.06.2018.
 */
/*
Задача 2.
Пользователь вводит строку.
Программа разбивает строку на слова, и “переворачивает” каждое слово, формирует из новых слов предложение и выводит его на экран.
 */

public class HM3_Task2 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner console = new Scanner (System.in);
        String a = console.nextLine();
        String[] b = a.split(" ");
        //System.out.println(Arrays.toString(b));

            for (int i = 0; i < b.length; i++) {
                for(int j = b[i].length() - 1; j>=0; j--) {
                    System.out.print(b[i].charAt(j));
                }
                    System.out.printf(" ");
                    }
}
}
