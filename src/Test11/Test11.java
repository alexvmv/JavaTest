package Test11;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        float d1 = scan.nextFloat();
        str = Float.toString(d1);

        System.out.println("Введите число:");
        float d2 = scan.nextFloat();
        int i = (int) d2;

        float max = Math.max(d1,d2);
        System.out.println(max);

        float min = Math.min(d1,d2);
        double m = (double) min;
        System.out.println(m);

    }
}
