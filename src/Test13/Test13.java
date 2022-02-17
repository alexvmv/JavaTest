package Test13;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        str = scan.nextLine();
        int count = 0;
        String[] words = str.split(" ");
        for (String mystr : words) {
            if (mystr.matches("^[a-zA-Z]+$")) {
                System.out.print(mystr + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Количество слов "+ count);
    }
}