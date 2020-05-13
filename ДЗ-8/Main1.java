package edu.academy.home;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.bin"))){

            for (int i = 0; i < 100_000; i++) {
                StudentList student = new StudentList();
                oos.writeObject(student);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
