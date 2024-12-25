import java.util.Scanner;
public class SimpleInterest
{
	static double SI()
	{
		Scanner jt=new Scanner(System.in);
		System.out.println("Enter the p");
		int p=jt.nextInt();
		System.out.println("Enter the r");
		int r=jt.nextInt();
		System.out.println("Enter the t");
		int t=jt.nextInt();
		double si=(p*r*t)/100.0;
		return si;

	}
	public static void main(String[] args)
	{
		double j;
		j=SI();
		System.out.println(j);
	}
	
}