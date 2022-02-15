package Test12;

import java.util.Locale;

public class Test12 {
    public static void main(String[] args){
        String str = "I like Java!!!";
        boolean result1, result2, result3;

        result1 = str.contains("Java");
        if (result1 == true){
            System.out.println("Строка "+ str + " содержит подстроку Java");
        }
        else {
            System.out.println("Строка "+ str + " не содержит подстроку Java");
        }

        result2 = str.startsWith("I like");
        if (result2 == true){
            System.out.println("Строка "+ str + " начинается с подстроки I like");
        }
        else {
            System.out.println("Строка "+ str + " не начинается с подстроки I like");
        }

        result3 = str.endsWith("!!!");
        if (result3 == true){
            System.out.println("Строка "+ str + " заканчивается !!!");
        }
        else {
            System.out.println("Строка "+ str + " не заканчивается !!!");
        }

        if (result1 == true & result2 == true & result3 == true){
            System.out.println(str.toUpperCase());
            str = str.replace('a', 'o');
            int a = str.indexOf("J");
            int b = str.indexOf("!");
            System.out.println(str.substring(a,b));
        }

    }
}
