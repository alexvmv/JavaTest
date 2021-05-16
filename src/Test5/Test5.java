package Test5;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        float x = (float) scan.nextDouble();
        System.out.println("Введите второе число:");
        float y = (float) scan.nextDouble();
        System.out.println("Введите арифметический оператор (+,-,*,/):");
        String z = scan.next();
        scan.close();

        switch (z) {
            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            case "/":
                if (y!=0) {
                    System.out.println(x/y);
                }
                else {
                    System.out.println("Деление на ноль");
                }
                break;
        }
    }
}
