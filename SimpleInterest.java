import java.util.Scanner;

public class SimpleInterest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		SimpleInt s=new SimpleInt();

		System.out.print("Enter the principle amount : ");
		s.p=sc.nextDouble();

		System.out.print("Enter the rate of interest : ");
		s.r=sc.nextDouble();

		System.out.print("Enter the time period (in years) : ");
		s.t=sc.nextDouble();
		
		s.Calc_SI();
	}
}

class SimpleInt
{
	double p,r,t,si;

	public void Calc_SI()
	{
		si=(p*r*t)/100;
		System.out.println("The simple interest is "+si);
	}
}