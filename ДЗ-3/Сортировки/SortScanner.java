package edu.academy;

import java.util.Arrays;
import java.util.Scanner;

public class SortScanner {
    public static void main(String[] args) {
        int [] a = new int [10];
        System.out.println("Введите элементы массива:");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        boolean sorted = false;
        int n = a.length;
        while(!sorted){
            sorted = true;
            for (int i = 1; i < a.length; i++) {
                if(a[i]<a[i-1]){
                    int temp = a[i];
                    a[i] = a[i-1];
                    a[i-1]=temp;
                    sorted = false;
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        for(int v : a)
            System.out.print("");
            System.out.println(Arrays.toString(a));
    }
}
