package programs;

import java.util.Scanner;

class ReverseNumber2
{

	public static void main(String[] args)
	{
		int n,r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		n = sc.nextInt();
		while(n>0)
		{
			r=n%10;				//gets remainder i.e. last digit
			System.out.print(r);//prints next remainder in the same line
			n=n/10;				//gets the previous digits except the remainder
		}
	}
}
