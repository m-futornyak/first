package homework2;

import java.util.Scanner;

/**
 * Created by mfutornyak on 03.06.2018.
 */
/*Напишите программу, которая строит “сетку” 4 х 4:

*****************
        *   *   *   *   *
        *****************
        *   *   *   *   *
        *****************
        *   *   *   *   *
        *****************
        *   *   *   *   *
        *****************
        Ширина определяемая пробелами, вводится пользователем с шагом 3. Минимальная ширина составляет 3 пробела, максимальная 9.
        Количество строк высоты определяется как ширина деленная на 3.
*/

public class task1 {
    public static void main(String[] args) {
        System.out.print ("Введите число 3, 6 или 9: ");
        Scanner console = new Scanner (System.in);
        int a = console.nextInt();
        if (a == 3 )
            first();
        else if (a==6)
            second();
        else if  (a==9)
            third();
        else
            System.out.printf("Вы ввели неверное число!");

    }

    public static void first () {
          for (int i=0; i<4; i++) {
            System.out.printf("\n" + "*****************" + "\n" );
            for (int n=0; n<5; n++) {
                System.out.printf("*" + "   ");
            }
          }
        System.out.printf("\n" + "*****************" + "\n" );
    }

    public static void second () {
        for (int i=0; i<4; i++) {
            System.out.printf("\n" + "*****************************" + "\n" );
            for (int x=0; x<5; x++) {
                System.out.printf("*" + "      " );
            }
            System.out.printf ("\n");
            for (int y=0; y<5; y++) {
                System.out.printf("*" + "      ");
            }

        }
        System.out.printf("\n" + "*****************************" + "\n" );
    }

    public static void third () {
        for (int i=0; i<4; i++) {
            System.out.printf("\n" + "*****************************************" + "\n" );
            for (int x=0; x<5; x++) {
                System.out.printf("*" + "         " );
            }
            System.out.printf ("\n");
            for (int y=0; y<5; y++) {
                System.out.printf("*" + "         ");
            }
            System.out.printf ("\n");
            for (int e=0; e<5; e++) {
                System.out.printf("*" + "         ");
            }

        }
        System.out.printf("\n" + "*****************************************" + "\n" );
    }
}
