package Test6;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        float a;
        byte x, y, z;
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        x = scan.nextByte();

        if (x==1) {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - унция, 4 - фунт");
            y = scan.nextByte();
            switch (y) {
                case 1:
                    System.out.println("Введите число");
                    a = scan.nextFloat();
                    System.out.println("Граммы: " + a);
                    System.out.println("Килограммы: " + a / 1000);
                    System.out.println("Унции: " + a / 28.35);
                    System.out.println("Фунты: " + a / 454);
                    break;
                case 2:
                    System.out.println("Введите число");
                    a = scan.nextFloat();
                    System.out.println("Граммы: " + a * 1000);
                    System.out.println("Килограммы: " + a);
                    System.out.println("Унции: " + a * 35.274);
                    System.out.println("Фунты: " + a * 2.205);
                    break;
                case 3:
                    System.out.println("Введите число");
                    a = scan.nextFloat();
                    System.out.println("Граммы: " + a * 28.35);
                    System.out.println("Килограммы: " + a / 35.274);
                    System.out.println("Унции: " + a);
                    System.out.println("Фунты: " + a / 16);
                    break;
                case 4:
                    System.out.println("Введите число");
                    a = scan.nextFloat();
                    System.out.println("Граммы: " + a * 454);
                    System.out.println("Килограммы: " + a / 2.205);
                    System.out.println("Унции: " + a * 16);
                    System.out.println("Фунты: " + a);
                    break;
            }
        }



            if (x==2) {
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                z = scan.nextByte();
                switch (z) {
                    case 1:
                        System.out.println("Введите число");
                        a = scan.nextFloat();
                        System.out.println("Метры: " + a);
                        System.out.println("Мили: " + a/1609);
                        System.out.println("Ярды: " + a*1.094);
                        System.out.println("Футы: " + a*3.281);
                        break;
                    case 2:
                        System.out.println("Введите число");
                        a = scan.nextFloat();
                        System.out.println("Метры: " + a*1609);
                        System.out.println("Мили: " + a);
                        System.out.println("Ярды: " + a*1760);
                        System.out.println("Футы: " + a*5280);
                        break;
                    case 3:
                        System.out.println("Введите число");
                        a = scan.nextFloat();
                        System.out.println("Метры: " + a/1.094);
                        System.out.println("Мили: " + a/1760);
                        System.out.println("Ярды: " + a);
                        System.out.println("Футы: " + a*3);
                        break;
                    case 4:
                        System.out.println("Введите число");
                        a = scan.nextFloat();
                        System.out.println("Метры: " + a/3.281);
                        System.out.println("Мили: " + a/5280);
                        System.out.println("Ярды: " + a/3);
                        System.out.println("Футы: " + a);
                        break;
                }

            }
    }
}
