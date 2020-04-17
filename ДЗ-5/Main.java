package WarAndPeace;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = "D:"+separator+"JAVA"+separator+"Война и мир.txt";
        EasySearch easySearch = new EasySearch();
        System.out.println(easySearch.search(ReadAllBytes.readAllBytesJava7(path),"ВОЙНА"));
        System.out.println(easySearch.search(ReadAllBytes.readAllBytesJava7(path)," И "));
        System.out.println(easySearch.search(ReadAllBytes.readAllBytesJava7(path),"МИР"));
    }
}
