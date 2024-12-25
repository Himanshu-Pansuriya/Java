import java.util.*;

public class Hackerrank1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for(int i=0 ; i<3 ; i++){
            System.out.println("enter elements of an arr1 ");
            arr1[i] = sc.nextInt();
        }
        for(int i=0 ; i<3 ; i++){
            System.out.println("enter elements of an arr2 ");
            arr2[i] = sc.nextInt();
        }
        int a=0;
        int b=0;
        for(int i=0 ; i<3 ; i++){
            if(arr1[i]>arr2[i]){
                a++;
            }
            else if(arr1[i]<arr2[i]){
                b++;
            }
        }
        System.out.println(a+" "+b);
    }
}