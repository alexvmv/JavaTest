package Test11;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение x:");
        double x = scan.nextFloat();
        System.out.println("Введите значение y:");
        double y = scan.nextFloat();
        System.out.println("Введите значение z:");
        double z = scan.nextFloat();
        scan.close();
    }
}
