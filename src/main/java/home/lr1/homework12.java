package home.lr1;

/**
 * Created by mfutornyak on 25.05.2018.
 */
public class homework12 {
    public static void main(String[] args) {
        int a = 81678;
       int r1 = a/10000;
            System.out.printf("первaя цифра числа " + a +  " = " + r1);
        int r21 = a/1000;
        int r2 =  r21%10;
            System.out.printf("%nвторая цифра числа " + a +  " = " + r2);
       int r31 = a/100;
        int r3 = r31%10;
            System.out.printf("%nтретья цифра числа " + a + " = " + r3);
        int r41 = a%100;
         int r4 = r41 / 10;
            System.out.printf("%nчетвертая цифра числа " + a + " = " + r4);
        int r51 = a%100;
        int r5 = r51%10;
            System.out.printf("%nпятая цифра числа " + a + " = " + r5);



    }
}
