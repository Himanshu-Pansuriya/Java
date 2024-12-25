public class TryCatchDemo {
    public static void main(String[] args) {
         ABC h = new ABC();
         h.division();
    }
}
class ABC{
    int a = 10;
    int b = 0;
    int c = 1;

    try
    {
        c = a / b;
        System.out.println(c);
    }catch(ArithmeticException ae){
        System.out.println("this division is invalid");
    }
}