package programs;
import java.util.Scanner;

public class Factorial_Number
{
	public static void main(String[] args)
	{
		int n,a=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		n = sc.nextInt();
			for(int i=n;i>=1;i--) 
			{
				a *= i;
			}
			System.out.println(a);
	}
}
