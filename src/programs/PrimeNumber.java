package programs;
import java.util.Scanner;
public class PrimeNumber
{

	public static void main(String[] args)
	{
		int n,temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n = sc.nextInt();
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		if (temp==0)
		{
			System.out.println("Prime");
		}
		else {
			System.out.println("not Prime");
			 }
	}

}
