//WAP to print given number in reverse order.
import java.util.*;
public class Reverse{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" \n enter a number :");
        int a = sc.nextInt();
        int rev = 0;
       while(a!=0){
        
            int b = a % 10;
            rev = rev * 10 + b;
            a = a / 10 ;
       }
        System.out.println("Reverse order of number is :"+rev);
    }
}