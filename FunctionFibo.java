import java.util.Scanner;
public class FunctionFibo {
	static int Fibonacci(int a) {
		if (a == 0 || a == 1) {
			 return 1;
		//	System.out.println(a);
		} else {
			return Fibonacci(a - 1) + Fibonacci(a - 2);
			//System.out.print((a - 1) + (a - 2));
		}
	}

	public static void main(String[] args) {
		Scanner jt = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = jt.nextInt();
		int b;
		for (int i = 0; i <= a; i++) {
			b = Fibonacci(a);
			System.out.println(b);
		}
	}
}