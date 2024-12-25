import java.util.*;
 public class BinarySearch{
    public static void main(String[] args){
        int[] myArray={2,3,5,6,7,8,9,21,11,45};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to search : ");
        int searchNumber = sc.nextInt();
        sc.close();
        int low = 0;
        int high = myArray.length-1;
        boolean isFound = false;
        while(high>=low){
            int mid = (high + low)/2;
            if(searchNumber < myArray[mid]){
                high = mid-1;
            }
            else if(searchNumber == myArray[mid]){
                System.out.println("Found at = "+mid);
                isFound = true;
                break;
            }
            else{
                low = mid + 1;
            }
        }
        if(!isFound){
            System.out.println("number does not exist in array");
        }
    }
 }