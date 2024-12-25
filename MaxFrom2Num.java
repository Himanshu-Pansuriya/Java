//2. WAP to find maximum number from given two numbers using method.
import java.util.Scanner;
public class MaxFrom2Num
{
	static void Lrg(int x,int y)
	{
		int c;
		c=(x>=y)?x:y;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Scanner jt=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int x=jt.nextInt();
		System.out.println("Enter 2st number");
		int y=jt.nextInt();
		Lrg(x,y);		
	}
}
