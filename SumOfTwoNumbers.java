//sum of two numbers in java.
import java.util.*;
class Main{
    public int SumOfTwoNumbers(int a,int b){
     int sum = a + b ;       
       return sum;
    }
    public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           System.out.println("enter a :");
           int a = sc.nextInt();
           System.out.println("enter b :");
           int b = sc.nextInt();

          Main obj = new main();     
          int sum = obj.SumOfTwoNumbers(a,b);
          
            System.out.println("sum is :" +sum);
    }
}