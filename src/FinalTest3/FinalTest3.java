package FinalTest3;

import java.util.Scanner;

public class FinalTest3 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Количество строк:");
        int n = scan.nextInt();
        scan.nextLine();
        String[] array = new String[n];
        for (int i = 0; i < n; i++){
            System.out.print("Строка "+ (i + 1) +":");
            array[i] = scan.nextLine();
        }
        int str = 0;
        int max = 0;
        int index = 0;

        for (int i = 0; i < n; i++) {
            str = Math.toIntExact(array[i].chars().distinct().count());
            if (str>max) {
                max = str;
                index = i;
            }
        }

        System.out.print("Ответ:" + array[index]);

    }
}
