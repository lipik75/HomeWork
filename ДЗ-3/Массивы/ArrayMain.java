package edu.academy;

public class ArrayMain {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {0,1,2,3,4,5,6,7,8,9,10};
        int[] arr3 = {0,1,2,3,4,5,6,7,8,9,10};
        int[] arr4 = {0,1,2,3,4,5,6,7,8,9,10};
        Arrays array = new Arrays();
        array.for_(arr1);
        array.foreach_(arr2);
        array.while_(arr3);
        array.dowhile_(arr4);
    }

}
