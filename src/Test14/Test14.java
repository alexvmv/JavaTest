package Test14;

import java.util.Random;

public class Test14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i=0; i< array.length; i++){
            array[i] = random.nextInt(41)-20;
        }

        /* Вывод элементов массива*/
        for (int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }


        int min = Math.min(array[0],array[1]);
        int max = Math.max(array[0],array[1]);
        for (int i=2; i<array.length-1; i++){
            min = Math.min(min,array[i]);
            max = Math.max(max,array[i]);
        }

        System.out.println("Минимальный элемент массива = "+min);
        System.out.println("Максимальный элемент массива = "+max);

        if (Math.abs(max)>Math.abs(min)){
            System.out.println("Наибольшее значение по модулю = "+max);
        }
        else if (Math.abs(min)>Math.abs(max)) {
            System.out.println("Наибольшее значение по модулю = "+min);
        }
        else {
            System.out.println("Значения по модулю равны");
        }
    }
}
