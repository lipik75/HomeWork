package edu.academy;

import java.util.Scanner;

public class MainSwith {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше имя:  ");
        String name = in.nextLine();
        switch (name){
            case "Вася":
                System.out.printf("Приветствую тебя %s \nЯ так долго ждал тебя!", name);
                break;
            case ("Анастасия"):
                System.out.printf("Я так долго ждал Вас, %s!", name);
                break;
            default:
                System.out.printf("Добрый день, %s! А Вы кто?", name);
                break;
        }
    }
}

