package Test8;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        int a;
        int Sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        a = scan.nextInt();
        if (a<=0) {
            System.out.println("Введите число >0:");
            a = scan.nextInt();
            for (int i=1; i<=a; i=i+2){
                Sum+=i;
            }
            System.out.println("Сумма:"+Sum);
        }
        else {
            for (int i=1; i<=a; i=i+2){
                Sum+=i;
            }
            System.out.println("Сумма:"+Sum);
        }
    }
}
