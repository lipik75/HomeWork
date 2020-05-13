package edu.academy.home;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args)  throws IOException{
        List<StudentList> listOfStudents = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream("Student.bin");
               ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (fis.available() != -1) {
                StudentList student = (StudentList) ois.readObject();
                listOfStudents.add(student);
            }
        } catch (EOFException | ClassNotFoundException ignored){
        }
        Collections.sort(listOfStudents, new Comparator<StudentList>() {
            @Override
            public int compare(StudentList o1, StudentList o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
//        for (int i = 0; i < listOfStudents.size(); i++) {
//            System.out.printf("Студент Nº%d = %s \n", i+1, listOfStudents.get(i));
//        }
        FileWriter writer = new FileWriter("studentsSort.txt");
        writer.write("Сортированный список студентов:");
        for (StudentList stud: listOfStudents) {
            String name = stud.name;
            writer.write(name+System.getProperty("line.separator"));
            System.out.println(name);
        }
        writer.flush();
        writer.close();
    }
}
