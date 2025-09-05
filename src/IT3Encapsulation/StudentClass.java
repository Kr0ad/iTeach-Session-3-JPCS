package IT3Encapsulation;

public class StudentClass {

    //Encapsulation
    /*
    Bundling data (variables) and methods (functions) into a // single unit (class)
    Protects data by controlling access modifiers (private, public, protected)
    Helps maintain data integrity and hide implementation details
    getters - make a field readable
    setters - make a field writable
     */

    //attributes
    private String name;
    private int age;
    private String course;
    private double gpa;


    //getter
    String getName(){
        return name;
    }
    String getAge(){
        return course;
    }

    //setter
    void setName(String name){
        this.name = name;
    }

}
