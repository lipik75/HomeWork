package edu.academy;

import java.util.Scanner;

public class ClassWork {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Попробуйте ввести число 10. У вас 5 попыток :)");
        int number = 0;
        int count = 0;

        while (number != 10 && count < 5) {
            number = in.nextInt();
            count++;
            if (number != 10){
                System.out.println("Попробуйте снова");
            }
            else{
                System.out.println("Вам удалось это сделать!");
                break;
            }
        }
    }
}
