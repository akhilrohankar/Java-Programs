package programs;
import java.util.Scanner;
class Number
{
	public void num() 
	{
		int n,a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		n = sc.nextInt();
		a=n%2;
			if(a==0)
				{
					System.out.println("This is an even number.");
				}
			else
				{
					System.out.println("This is an odd number.");
				}
	}
}

public class EvenOdd
{
	public static void main(String[] args)
	{
		Number ob = new Number();
		ob.num();
	}
}
