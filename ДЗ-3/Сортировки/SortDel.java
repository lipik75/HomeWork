package edu.academy;

import java.util.Arrays;
import java.util.Scanner;

public class SortDel {
    public static void main(String[] args) {
        int [] a = new int [10];
        System.out.println("Введите элементы массива:");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int n = a.length;
        for ( int i = 0, m = 0; i != n; i++, n = m ) {
            for ( int j = m = i + 1; j != n; j++ ) {
                if ( a[j] != a[i] ) {
                    if ( m != j ) a[m] = a[j];
                    m++;
                }
            }
        }
        if ( n != a.length ) {
            int[] b = new int[n];
            for ( int i = 0; i < n; i++ ) b[i] = a[i];
            a = b;
        }
        for(int v : a)
            System.out.print("");
        Sorts array = new Sorts();
        array.bubbleSort_(a);
    }
}

