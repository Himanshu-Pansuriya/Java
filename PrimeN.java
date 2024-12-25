//4. WAP to accept a number and check whether the number is prime or not. Use method name check (int n). The method returns 1, if the number is prime otherwise, it returns 
//0.
import java.util.*;
    public class PrimeN
{
   public static int main(String[] args){
      Scanner sc = new Scanner(System.in);
      int i ,a;
      System.out.println("enter a number :");
      a = sc.nextInt();
      i = check(a);
      if(i==1){
        System.out.println("number is prime");
      }
      else{
         System.out.println("number is not prime");
      }
   }
   public static int check(int n){
       int i;
       for(i=2;i<n/2;i++){
            if(n%i==0){
                return 0;
            }
       }
       return 1;
   }
}