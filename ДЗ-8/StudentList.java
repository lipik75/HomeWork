package edu.academy.home;

import java.io.Serializable;

public class StudentList implements Serializable {

    private String name;

    public String studentsNames(){
        String[] arr = {"David", "Petr", "Aleksandr", "Randy", "Sam", "Mikel", "Poul", "Tim", "Vasily", "Frank"};
        return arr[(int) (Math.random() * 10)];
    }
    public StudentList() {
        this.name = studentsNames();
    }
    @Override
    public String toString() {
        return name;
    }
}
