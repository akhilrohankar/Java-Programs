package programs;
import java.util.Scanner;
public class SmallestOfThreeNumber
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number = ");
		a = sc.nextInt();
		System.out.print("Enter Second number = ");
		b = sc.nextInt();
		System.out.print("Enter Third number = ");
		c = sc.nextInt();
		if(a<=b && a<=c) {
			System.out.println(a+" is the smallest number");
		}
		else if (b<=c && a<=c) {
			System.out.println(b+" is the smallest number");
		}
		else {
			System.out.println(c+" is the smallest number");

		}
	}
}
