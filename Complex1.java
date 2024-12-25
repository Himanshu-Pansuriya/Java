import java.util.Scanner;
class complex{
    int real;
    int imaginary;

    complex(){
        real = 0 ;
        imaginary = 0 ;
    }
    complex(int real,int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    void addition (complex c){
        System.out.println(" sum = "+(this.real + c.real)+"+"+(this.imaginary + c.imaginary)+"i");
    }
}
public class Complex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int real = sc.nextInt();
        int imaginary = sc.nextInt();
        int real1 = sc.nextInt();
        int imaginary1 = sc.nextInt();
        complex c1 = new complex(real,imaginary);
        complex c2 = new complex(real1,imaginary1);
        c1.addition(c2);
    }
}