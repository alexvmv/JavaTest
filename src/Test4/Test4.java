package Test4;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение x:");
        double x = scan.nextFloat();
        System.out.println("Введите значение y:");
        double y = scan.nextFloat();
        System.out.println("Введите значение z:");
        double z = scan.nextFloat();
        scan.close();

        double avg = (x+y+z)/3;
        System.out.println(avg);

        double avg2 = Math.floor(avg/2);
        System.out.println(avg2);

        if (avg2>3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
