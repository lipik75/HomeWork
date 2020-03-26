package edu.academy;

public class Arrays {

    public void for_ (int[]a){
        System.out.println("");
        for (int i = 1; i < a.length; i+=2) {
                System.out.print(a[i]+" ");

        }System.out.println("");
    }

    public void foreach_ (int[]a){
        int j = 0;
        for (int i:a) {
                System.out.print(i + " ");
                j+=2;
        }
        System.out.println("");
    }
    public void while_ (int[]a){
        int i = 1;
        while(i<a.length){
                System.out.print(a[i]+" ");
            i+=2;
        }
        System.out.println("");
    }
    public void dowhile_ (int[]a){
        int i = 1;
        do{
            System.out.print(a[i]+" ");
            i+=2;
        } while (i<a.length);
        System.out.print("");
    }
}
