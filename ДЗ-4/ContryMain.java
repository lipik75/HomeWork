package Countys;

import java.util.Scanner;

public class ContryMain {
    public static void main(String[] args) {
        System.out.println("Введите название страны: ");
        Scanner in = new Scanner(System.in);
        String c1 = in.nextLine();
        System.out.println("Введите название еще одной страны (для сравнения): ");
        String c2 = in.nextLine();

        CountryAreaComparator comparator =  new CountryAreaComparator();

        if (comparator.compare(Country.valueOfIgnoreCase(c1), Country.valueOfIgnoreCase(c2)) == 1){
            System.out.println("Площадь первой страны больше чем у второй");
        }
        if (comparator.compare(Country.valueOfIgnoreCase(c1), Country.valueOfIgnoreCase(c2)) == 2){
            System.out.println("Площадь первой страны меньше чем у второй");
        }
        if (comparator.compare(Country.valueOfIgnoreCase(c1), Country.valueOfIgnoreCase(c2)) == 0){
            System.out.println("Хоть это и нереально, но площади стран равны");
        }
    }
}
