package IT3Encapsulation;

import IT2Classes.StudentClass;

public class Main {
    public static void main(String[] args) {
        StudentClass student1 = new StudentClass("Eleone", "BS Information Technology");
        System.out.println("Name: " + student1.getName());
        student1.setName("Mikaela");
    }
}
