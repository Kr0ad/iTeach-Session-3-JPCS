package IT2Classes;

public class StudentClass {

    //attributes
    String name = "Jared Abraham Aguirre";
    int age = 17;
    String course = "BS Biology";
    double gpa = 2.75;

    //Constructor: is a special method used to initialize objects.
    //It has the same name as the class and no return types.
    StudentClass(String studentName, int age, String course, double gpa){
        this.name = studentName;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
    }

    public StudentClass(String studentName, String course){
        this.name = studentName;
        this.course = course;
    }

    //methods
    void study(){
        System.out.println(name + " is studying.");
    }
}
