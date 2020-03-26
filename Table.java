package edu.academy;

public class Table {

    public void multTable() {
        int result;
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                result = i*j;
                String s = Integer.toString(result);
                if (s.length()==1) {
                    System.out.print("  " + result);
                }
                if (s.length()>1){
                    System.out.print(" "+result);
                }
            }
        System.out.println();
        }
    }
}