package IT2Classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Class: A design or template. It defines the properties.

        //Object: A real thing created from the class.
        //It uses the class' design to have its own data and perform actions

        StudentClass student1 = new StudentClass("Jared", 17, "BS Biology", 3.25);
        student1.study();
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("Course: " + student1.course);
        System.out.println("GPA: " + student1.gpa);
        System.out.println(" ");

        StudentClass student2 = new StudentClass("Sebastian", 24, "BS Radiologic Technology",1.45);
        student2.study();
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("Course: " + student2.course);
        System.out.println("GPA: " + student2.gpa);
        System.out.println(" ");

        StudentClass student3 = new StudentClass("Justine Rosales", "BS Accountancy");
        student3.study();
        System.out.println("Name: " + student3.name);
        System.out.println("Course: " + student3.course);

    }
}
