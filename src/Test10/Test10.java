package Test10;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        int str, length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк массива");
        str = scan.nextInt();
        System.out.println("Введите количество столбцов массива");
        length = scan.nextInt();
        int[][] myArray = new int[str][length];
        for (int i=0; i<str; i++){
            for (int j=0; j<length; j++){
                System.out.println("Введите значение элемента "+i+j);
                myArray[i][j]= scan.nextInt();
            }
        }
        for (int j=0; j<length; j++) {
            myArray[0][j] = myArray[0][j] * 3;
            System.out.println(myArray[0][j]);
        }
    }
}
