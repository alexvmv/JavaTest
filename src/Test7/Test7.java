package Test7;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        int length;
        final int x = 20;
        final int y = 3;
        final int z = 8;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива");
        length = scan.nextInt();
        int[] myArray = new int[length];
        for (int i=0; i<length; i++){
            System.out.println("Введите элемент массива:");
            myArray[i] = scan.nextInt();
            if (myArray[i]==x | myArray[i]==y | myArray[i]==z)
                System.out.println("Данное значение имеется в константах");
        }
    }
}

