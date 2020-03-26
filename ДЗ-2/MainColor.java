package edu.academy;
import java.util.Scanner;

public class MainColor {

    public static void main(String[] args) {
        System.out.println("Введите номер цвета: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Color color = new Color(number);
        System.out.println("Название цвета: " + color.getName());
        System.out.println("Номер цвета: " + color.getNumber());

    }
}
