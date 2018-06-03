package homework2;

import java.util.Scanner;

/**
 * Created by mfutornyak on 03.06.2018.
 */
/*
Задача 3.
        Сначала единственным программистом в компании был ее основатель, а каждый следующий программист,
        которого нанимали на работу, проходил по одному собеседованию с каждым из программистов, которые уже работали в компании на тот момент.
        Зная текущее количество программистов (вводится пользователем), определите, сколько всего собеседований было проведено в стенах компании.
        Задачу решить с помощью рекурсии.*/

public class task3 {
    public static void main(String[] args) {
    System.out.println(rez(x);
    }

    public static int rez (int x) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        if (x==1) {
            return 1;
        } else {
            return rez (x - 1) + x;
            System.out.printf("Всего собеседвоанией было: " + rez);
        }
    }
}

