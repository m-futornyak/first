package homework3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mfutornyak on 22.07.2018.
 */
/*

Задача 3.
Пользователь задает длину массива (положительное число от 10 до 100).
Программа заполняет массив случайными числами. Выводит массив и все числа массива кратные 3-ем.

 */

public class HM3_Task3 {
    public static void main(String[] args) {
    System.out.println("Введите длину маcсива (положительное число от 10 до 100):");
    Scanner console = new Scanner (System.in);
    Integer  a = console.nextInt();
        if (a >= 10 & a <= 100) {
            random1(a);}
        else {System.out.println("Вы ввели не правильное число");}
        }

    public static void random1 (int a) {
        {
            int [] array = new int[a];
                for (int i=0; i< array.length; i++) {
                    array[i] = (int) (Math.random() * 2147483647);
                } System.out.print (Arrays.toString(array));

                for (int i=0; i<array.length; i++){
                    if (array[i]%3==0) {
                    System.out.println ("\n" + array[i]);}
                    else continue;
                    }
        }

    }
}
