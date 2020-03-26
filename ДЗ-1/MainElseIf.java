package edu.academy;

import java.util.Scanner;

public class MainElseIf {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше имя:  ");
        String name = in.nextLine();
        String a = "Вася";
        String b = new String ("Анастасия");

        if (a.equals(name))
        {
            System.out.printf("Приветствую тебя %s \nЯ так долго ждал тебя!", name);
        }
        else if (b.equals(name))
        {
            System.out.printf("Я так долго ждал Вас, %s!", name);
        }
        else {
            System.out.printf("Добрый день, %s! А Вы кто?", name);
        }
    }
}

