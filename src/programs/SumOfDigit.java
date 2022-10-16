package programs;
import java.util.Scanner;
class SumOfDigit
{

	public static void main(String[] args)
	{
		int n,r,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : "); 
		n = sc.nextInt();
		while(n>0) {
			r=n%10;
			n=n/10;
			sum+=r;//sum=sum+r
		}
	System.out.println("Sum of the digits = "+sum);
	}

}
