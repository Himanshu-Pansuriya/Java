//Write a program in Java to demonstrate use of this keyword. Check whether this can access the Static variables of the class or not.
class UseOfThis{
    String name;
    static int rollno;
    UseOfThis(){
        String name = "Himanshu";
        int rollno = 161;
        System.out.println("name of the student is "+ name + " and rollno is "+rollno );
    }
    UseOfThis(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
        System.out.println("name of the student is "+ name + " and rollno is "+rollno );
    }
}
public class ThisStatic {
    String name;
    static int rollno;
    public static void main(String[] args) {
        UseOfThis uot = new UseOfThis();
        UseOfThis uot1 = new UseOfThis(name,rollno);
    }
}