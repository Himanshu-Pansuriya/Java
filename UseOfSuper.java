//Demonstrate the use of Super Keyword
// 1. WAP to demonstrate single inheritance, multilevel inheritance and hierarchical inheritance.
import java.util.Scanner;
public class UseOfSuper {
    public static void main(String[] args) {
//        Human h = new Human();
//        Student s = new Student();
//        Human h1 = new Human(12,19);
        Student s1 = new Student(17,20);
        s1.Student1();
    }
}
class Human {
    Human(){
        int a=10;
        int b=15;
        System.out.println(a+b);
    }
    Human(int a ,int b){
        this();
        System.out.println(a+b);
    }
    void Human1() {
        System.out.println("This is a Human class ");
        System.out.println("hhh");
    }
}
class Student extends Human{
    Student(){
        super(12,40);
        int a=15;
        int b=20;
        System.out.println(a+b);
    }
    Student(int a ,int b){
        this();
        System.out.println(a+b);
    }
    void Student1() {
        super.Human1();
        System.out.println("This is a Student class which inherit from Human class");
        System.out.println("nnn");
    }
}