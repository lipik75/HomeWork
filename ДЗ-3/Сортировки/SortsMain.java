package edu.academy;

public class SortsMain {
    public static void main(String[] args) {
        int[] arr1 = {41,63,87,32,25,74,98,57};
        int[] arr2 = {66,42,78,21,12,90,79,33};
        int[] arr3 = {32,57,87,99,51,21,12,74};
        int[] arr4 = {10,45,13,9,6,66,79,98,1};

        Sorts array = new Sorts();

        array.bubbleSort(arr1);
        array.ShakerSort(arr2);
        array.Choise(arr3);
        array.turning_on(arr4);
    }
}
