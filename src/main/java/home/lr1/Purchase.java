package home.lr1;

import java.util.Scanner;

/**
 * Created by mfutornyak on 25.05.2018.
 */
public class Purchase {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        double cookie = 15;
        double candy = 20;

        double res1 = cookie * 0.3 + candy * 0.4;
        double res2 = (cookie * 2 + candy * 1.8) * 3;
        System.out.printf("сумма покупки = " + res1);
        System.out.printf("%nсумма 3 покупок из 2 кг печенья и 1,8 конфет равна = " + res2);

    }
}
