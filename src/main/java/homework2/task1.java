package homework2;

import java.util.Scanner;

/**
 * Created by mfutornyak on 03.06.2018.
 */
public class task1 {
    public static void main(String[] args) {
        System.out.print ("Введите число 3, 6 или 9: ");
        Scanner console = new Scanner (System.in);
        int a = console.nextInt();
        if (a == 3 )
            first();
        else if (a==6)
            System.out.println(a);
        else if  (a==9)
            System.out.println(a);
        else
            System.out.printf("Вы ввели неверное число!");

    }

    public static void first () {
        System.out.printf ("вложенный класс");    }

}
