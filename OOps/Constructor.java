

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("thanos");
        Student s3 = new Student(345);

        Student s4 = new Student(s3);
        s4.display();
        s3.display();
        s1.display();
    }
    
}
class Student {
    String name;
    String password ;
    int rollno;
// non - parameterized  constructor 
    Student(){
        System.out.println("Welcome to constructor world -->");

    }

    Student(String name){
        this.name = name;

    }


    Student(int rollno){
        this.rollno = rollno;

    }

    // copy constuctor 
    Student(Student s1){
        this.name = s1.name;
        this.rollno = s1.rollno;
    }


    void display(){
        System.out.println(this.name);
        System.out.println(this.rollno);
        System.out.println(this.password);

    }


}