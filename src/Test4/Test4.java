package Test4;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение x:");
        float x = (float) scan.nextDouble();
        System.out.println("Введите значение y:");
        float y = (float) scan.nextDouble();
        System.out.println("Введите значение z:");
        float z = (float) scan.nextDouble();
        scan.close();

        float avg = (x+y+z)/3;
        System.out.println(avg);

        double avg2 = Math.floor(avg/2);
        System.out.println(avg2);
        if (avg2>3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
