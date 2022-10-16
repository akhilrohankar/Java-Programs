package programs;
import java.util.Scanner;

class Palindrome_Number
{

	public static void main(String[] args)
	{
		int n,r,sum=0,temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		n = sc.nextInt();
		temp=n;
			while(n>0)
			{
				r=n%10;   		//to isolate the last digit;Example: 121, r=1
				sum=(sum*10)+r;
				n=n/10;			//to get the previous digits of the last isolated digit, n=12
				System.out.println(temp);
				if(temp==sum) 
				{
					System.out.println("It is a Palindrome Number.");
				}
				else
				{
					System.out.println("It is not a Palindrome Number.");
				}
	}

	}
			
}
