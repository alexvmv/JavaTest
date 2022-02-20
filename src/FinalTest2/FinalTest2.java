package FinalTest2;

import java.util.Scanner;

public class FinalTest2 {
    public static void main(String[] args) {
        String str;
        int x, value1, value2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввод:");
        str = scan.nextLine();
        String[] array = str.split("");

        if (array[0].equals("x")) {
            value1 = Integer.parseInt(array[2]);
            value2 = Integer.parseInt(array[4]);
            switch (array[1]) {
                case "+":
                    x = value2 - value1;
                    System.out.println("Вывод:" + x);
                    break;
                case "-":
                    x = value1 + value2;
                    System.out.println("Вывод:" + x);
                    break;
                default:
                    System.out.println("Ввод некорректен");
            }
        } else if (array[2].equals("x")) {
            value1 = Integer.parseInt(array[0]);
            value2 = Integer.parseInt(array[4]);
            switch (array[1]) {
                case "+":
                    x = value2 - value1;
                    System.out.println("Вывод:" + x);
                    break;
                case "-":
                    x = value1 - value2;
                    System.out.println("Вывод:" + x);
                    break;
                default:
                    System.out.println("Ввод некорректен");

            }
        }
        else System.out.println("Ввод некорректен");
    }
}
