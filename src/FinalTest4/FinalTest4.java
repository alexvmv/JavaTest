package FinalTest4;

import java.util.Scanner;

public class FinalTest4 {
    public static void main(String[] args) {
        String question = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        String correctAnswer = "Заархивированный вирус";
        String help = "Подсказка";
        String answer;
        boolean useHelp = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Отгадай загадку: " + question);

        for (int i=1; i<=3; i++) {
            System.out.println("Введите ответ, для получения подсказки введите Подсказка:");
            answer = scan.nextLine();
            if (answer.equals(correctAnswer)) {
                System.out.println("Правильно!");
                break;
            }
            else if (i!=3 & !answer.equals(help)){
                if (useHelp) {
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                }
                else {
                    System.out.println("Подумай еще!");
                }
            }
            else if (answer.equals(help)){
                if (i==1) {
                    System.out.println("Подсказка: З__рх_в_р_в_нн__ в_р_с");
                    useHelp = true;
                }
                else {
                    System.out.println("Подсказка уже недоступна");
                    i--;
                }
            }
            else {
                System.out.println("Обидно, приходи в другой раз");
            }
        }
    }
}

