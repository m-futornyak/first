package home.lr1;

/**
 * Created by mfutornyak on 25.05.2018.
 */
public class homework11 {
    public static void main(String[] args) {

        long x = 100;
        long y = 20;
        long z = 2;
        long n = 3;
        long rezult1 = x - (y + 123) / z * n;
            System.out.printf("Результат уравнения 1 = " + rezult1);
        int rezult2 = (int) ((x + (50 - y * z) / n) - x);
            System.out.printf("%nРезультат уравнения 2 = " + rezult2);
        float rezult3 = x / (y * (z - 1) - 564) + n;
            System.out.printf("%nРезультат уравнения 3 = " + rezult3);
        double rezult4 = -x / -y + z / (n + 15);
            System.out.printf("%nРезультат уравнения 4 = " + rezult4);

    }

}