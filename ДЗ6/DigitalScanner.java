package edu.academy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DigitalScanner {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 10. У Вас 3 попытки.");
        Scanner scanner = new Scanner(System.in);
        int i = 0, a = 0;
            do {
                i++;

                try {
                    a = scanner.nextInt();
                } catch (InputMismatchException e){
                    if (i<3)
                    System.out.println("Вы ввели нецифровое значение. Повторите попытку.");
                    scanner.next();
                }

            } while ((i < 3) && ((a < 1) || (a > 10)));

        if (a>1 && a<10){
            if (i==1)
                System.out.printf("Немыслимо! Вам удалось ввести число %d, попадающее в диапазон от 1 до 10, и затратили Вы на это %d попытку", a, i);

            else
                System.out.printf("Немыслимо! Вам удалось ввести число %d, попадающее в диапазон от 1 до 10, и затратили Вы на это %d попытки", a, i);
        }
        else
            System.out.println("Попытки исчерпаны. Вам не удалось ввести число в диапазоне от 1 до 10");
    }
}
