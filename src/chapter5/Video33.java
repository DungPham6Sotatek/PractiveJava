package chapter5;

import product.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Video33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st1 = new Student("Dung" , 1);
        Student st2 = new Student("Van Anh" , 2);
        Student st3 = new Student("Nam" , 3);
        Student st4 = new Student("Bin" , 4);
        Student st5 = new Student("BAp" , 5);
        Student st6 = new Student(" Dung" , 6);
        Student st7 = new Student("dung" , 7);
        Student st8 = new Student("D u n g" , 8);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        students.add(st7);
        students.add(st8);

        System.out.println(students);

        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().contains("Dung")) {
                System.out.println("hoc sinh co ten la dung: " + students.get(i));
            }
        }
    }
}
