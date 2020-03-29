package edu.academy;

import java.util.Arrays;

public class Sorts {

    //пузырьковая сортировка
    public void bubbleSort (int[]a){
        System.out.println("Введенный массив:");
        System.out.println(Arrays.toString(a));
        boolean sorted = false;
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
        System.out.println("Отсортированный пузырьковым способом массив:");
        for(int v : a)
            System.out.print("");
        System.out.println(Arrays.toString(a));
        System.out.println();
    }
    //Шейкерная сортировка
    public void ShakerSort (int[]a){
        System.out.println("Введенный массив:");
        System.out.println(Arrays.toString(a));
        int temp;
        int left = 0;
        int right = a.length - 1;
        do{
            for (int i = left; i < right; i++) {
                if (a[i] > a[i+1]){
                  temp = a[i];
                  a[i] = a[i+1];
                  a[i+1]=temp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (a[i] < a[i-1]){
                    temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                }
            }
            left++;
        }while (left<right);
        System.out.println("Отсортированный шейкерным способом массив:");
        for(int v : a)
            System.out.print("");
        System.out.println(Arrays.toString(a));
        System.out.println();
    }
    //Сортировка выбором
    public void Choise (int[]a){
        System.out.println("Введенный массив:");
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int min_i = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < min){
                    min = a[j];
                    min_i = j;
                }
            }
            if (i != min_i){
                int temp = a[i];
                a[i] = a[min_i];
                a[min_i] = temp;
            }
        }
        System.out.println("Отсортированный выбором массив:");
        for(int v : a)
            System.out.print("");
        System.out.println(Arrays.toString(a));
        System.out.println();
    }
    //Сортировка с помощью включения
    public void turning_on (int[]a){
        System.out.println("Введенный массив:");
        System.out.println(Arrays.toString(a));
        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i-1;
            while(j>=0&& a[j] > current){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
        System.out.println("Отсортированный c помощью включения массив:");
        for(int v : a)
            System.out.print("");
        System.out.println(Arrays.toString(a));
        System.out.println();
    }
    public void bubbleSort_ (int[]a){
        boolean sorted = false;
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
        System.out.print("Отсортированный массив без дубликатов: ");
        for(int v : a)
            System.out.print("");
        System.out.println(Arrays.toString(a));
    }

}

