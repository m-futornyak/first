package homework2;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

/**
 * Created by mfutornyak on 03.06.2018.
 */
/*
Задача 2.
Пользователь вводит строку.
Программа разбивает строку на слова, и “переворачивает” каждое слово, формирует из новых слов предложение и выводит его на экран.
 */
public class task5 {
    public static void main(String[] args) {

        System.out.println(result1(result));
}

public static String result1 (String a){
    Scanner console = new Scanner (System.in);
    String a = console.nextLine();
    char[] b = a.toCharArray();
    String result = " ";
    for (int i = b.length - 1; i >= 0; i--) {
        result = result + b[i];
    }
    return result;
}
}
