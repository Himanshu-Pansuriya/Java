//WAP to find factorial of the given number
import java.util.*;
public class Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int a = sc.nextInt();
        int fact=1;

        for(int i=1 ; i<=a ; i++){
          fact = fact * i ;  
        }
        System.out.println("factorial is "+fact);
    }
}
