package programs;
import java.util.Scanner;

public class Largest_Of_Three_Number
{

	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number : ");
		a = sc.nextInt();
		System.out.print("Enter Second number : ");
		b = sc.nextInt();
		System.out.print("Enter Third number : ");
		c = sc.nextInt();
			if (a>=b && a>=c)
			{
				System.out.println(a+" is the greatest number");
			}
			else if(b>=a && b>=c)
			{
				System.out.println(b+" is the greatest number");
			}
			else
			{
				System.out.println(c+" is the greatest number");
			}

	}

}
