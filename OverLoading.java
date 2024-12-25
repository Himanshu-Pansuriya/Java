//5. WAP that calculates area of circle, triangle and square using method overloading.
import java.util.*;
public class OverLoading{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number,1 for circle, 2 for triangle, 3 for square :");
        int a = sc.nextInt();
        double i=0;
          switch(a){
            case 1 :
            double r = sc.nextDouble();
            i = Himanshu(r);
            break;

            case 2 :
            double h = sc.nextDouble();
            double b = sc.nextDouble();
            i = Himanshu(h,b);
            break;

            case 3 :
            int l = sc.nextInt();
            i = Himanshu(l);
            break;
        }
        System.out.println("answer is :"+i);
    }

    public static double Himanshu(double r){
        return 3.14*r*r;
    }
    public static double Himanshu(double h,double b){
        return 0.5*h*b;
    }
    public static double Himanshu(int l){
        return l*l;
    }
}