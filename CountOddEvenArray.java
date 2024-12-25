//WAP to count number of even or odd number from an array of n numbers.
import java.util.*;
public class CountOddEvenArray{
        public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int co=0,ce=0;
         int n = sc.nextInt();
         int[] arr= new int[n];

     for(int i=0 ; i<n ;i++){
         System.out.println("Enter number : ");
           arr[i] = sc.nextInt();
    }

    for(int i=0 ; i<n ; i++){
            if(arr[i]%2==0){
                ce++;
            }
            else{
                co++;
            }
    }
            System.out.println(ce +","+ co);
    }
}