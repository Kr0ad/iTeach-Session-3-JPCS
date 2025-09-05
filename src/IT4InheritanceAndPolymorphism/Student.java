package IT4InheritanceAndPolymorphism;

public class Student extends User {
    String course;

    //super keyword: Used in a subclass to access parent class methods, variables, or constructors

    Student(int id, String name, String email, String course){
        super(id, name, email);
        this.course = course;
    }

    // Polymorphism: one method
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Course: " + course);
    }

}
