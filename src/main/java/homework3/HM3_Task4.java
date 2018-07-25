package homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mfutornyak on 22.07.2018.
 */

/*
Задача 4.
Программа запрашивает у пользователя ФИО, мобильный телефон и email, и проверяет
данные на валидность с помощью регулярных выражений.
ФИО - только буквы английского алфавита, дефис и пробел
Мобильный телефон - +380 далее 2 цифры кода (украина) и 7 любых цифр
email - любые латинские символы, цифры, дефис и нижний прочерк, обязательный символ @
и .
Проверить все вводимые данные и вывести неверно введенные.
 */
public class HM3_Task4 {
    public static void main(String[] args) {

        System.out.printf("Введите ФИО (только буквы английского алфавита, дефис и пробел):");
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();

        Pattern p1 = Pattern.compile("[a-zA-Z -]+");
        Matcher m1 = p1.matcher(a);
        String[] b;
        String delimeter = " ";
        b = a.split(delimeter);

        for (int i=0; i<b.length; i++) {
            System.out.println(b[i]);
            System.out.println(b[i].matches("[a-zA-Z -]+"));
        }


        System.out.printf("Введите Мобильный телефон - +380 далее 2 цифры кода (украина) и 7 любых цифр):");
        Scanner console2 = new Scanner(System.in);
        String a2 = console.nextLine();
        Pattern p2 = Pattern.compile("[a-zA-Z -]+");
        Matcher m2 = p2.matcher(a);
        String[] b2;
        String delimeter2 = " ";
        b2 = a2.split(delimeter);

        for (int i=0; i<b.length; i++) {
            System.out.println(b2[i]);
            System.out.println(b2[i].matches("\\+380(99|66|50|63|67|98)[0-9]{7}"));
        }


        System.out.printf("Введите email - любые латинские символы, цифры, дефис и нижний прочерк, обязательный символ @ и . :");
        Scanner console3 = new Scanner(System.in);
        String a3 = console.nextLine();
        Pattern p3 = Pattern.compile("[a-zA-Z -]+");
        Matcher m3 = p3.matcher(a);
        String[] b3;
        String delimeter3 = " ";
        b3 = a3.split(delimeter);

        for (int i=0; i<b.length; i++) {
            System.out.println(b3[i]);
            System.out.println(b3[i].matches("[a-zA-Z0-9\\-_]+@[a-z0-9\\-_]+[.][a-z]{0,7}"));
        }



    }
 }

