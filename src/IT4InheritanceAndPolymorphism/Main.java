package IT4InheritanceAndPolymorphism;

public class Main {
    public static void main(String[] args) {

    /*
    Inheritance
        a mechanism where one class (child/subclass) inherits fields and methods
        from another class (parent/superclass)

        Promotes code reusability and reduces redundancy
        use the keyword "extends"
     */

        User student1 = new Student(1, "Eleone", "eleone@dlsl.edu.ph", "IT");
        student1.displayInfo();

       User teacher1 = new Teacher(2, "Smile", "example.gmail.com", "LaSpirit");
       teacher1.displayInfo();
    }
}
