// Create a class “Rectangle” that would contain length and width as an instance variable and count as a static variable. Define constructors [constructor overloading (default,
// parameterized and copy)] to initialize variables of objects. Define methods to find area and to display variables’ value of objects which are created.
// [Note: define initializer block, static initializer block and the static variable and method. Also demonstrate the sequence of execution of initializer block and static initialize block]

class Rect{
    int length;
    int width;
    static int count = 0 ;

    Rect(){
        length = 5;
        width = 10;
        count++;
    }
    Rect(int length ,int width){
        this.length = length;
        this.width = width;
        count++;
    }
    Rect(Rect r){
        length =r.length;
        width = r.width;
        count++;
    }
    void findArea(){
        System.out.println("area = " +(this.length * this.width));
    }
    static void printCount(){
        System.out.println("no of object created in class = "+ count);
    }
}
public class RectDemo {
    public static void main(String[] args) {
        Rect r1 = new Rect();
        r1.findArea();
        Rect r2 = new Rect(10,20);
        r2.findArea();
        Rect r3 = new Rect(r2);
        r3.findArea();
        Rect.printCount();

    }
}