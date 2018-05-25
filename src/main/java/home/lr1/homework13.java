package home.lr1;

/**
 * Created by mfutornyak on 25.05.2018.
 */
public class homework13 {
    public static void main(String[] args) {
        double x = 5;
        double y = 0;
        double z = 0;
        double dlina = Math.sqrt( x * x + y * y + z * z);
        double x1 = x / dlina;
        double y1 = y / dlina;
        double z1 = z / dlina;
        System.out.printf("Единичный вектор равен:" + "( " + x1 + ", " + y1 + ", " + z1 + ")");
    }
}
