package IT4InheritanceAndPolymorphism;

public class User {
    int id;
    String name;
    String email;

    User(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
