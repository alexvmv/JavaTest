package Test9;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        int length;
        double sum = 0;
        double avg;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        length = scan.nextInt();
        double[] myArray = new double[length];
        for (int i=0; i<length; i++) {
            System.out.println("Введите элемент массива:");
            myArray[i] = scan.nextDouble();
        }

        for (double x: myArray) {
            sum+=x;
        }

        avg= sum/ myArray.length;
        System.out.println("Cреднее арифметическое элементов массива = "+avg);
        for (double x: myArray) {
            x*=avg;
            System.out.println(x);
        }
    }
}
