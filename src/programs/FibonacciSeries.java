package programs;
import java.util.Scanner;
public class FibonacciSeries
{
	public static void main(String[] args)
	{	int i,n,a=0,b=1,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		 n = sc.nextInt();
		 for(i=1;i<=n;i++){
			 System.out.print(a+" ");
			  c=a+b;
			  a=b;
			  b=c;
		 }
	}
}
