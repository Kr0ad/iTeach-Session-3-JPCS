package IT4InheritanceAndPolymorphism;

public class Teacher extends User{
    String subject;

    Teacher(int id, String name, String email, String subject){
        super(id, name, email);
        this.subject = subject;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}
