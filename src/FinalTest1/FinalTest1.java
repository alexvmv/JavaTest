package FinalTest1;

import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;

public class FinalTest1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Курс доллара: ");
        double usd = scan.nextDouble();
        System.out.println("Количество рублей: ");
        double rub = scan.nextDouble();
        scan.close();
        BigDecimal rate = new BigDecimal(rub/usd);
        System.out.println("Итого: "+rate.setScale(2, RoundingMode.HALF_UP) + "$" );

    }

}
