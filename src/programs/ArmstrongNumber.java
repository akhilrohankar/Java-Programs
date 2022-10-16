package programs;
import java.util.Scanner;
public class ArmstrongNumber
{

	public static void main(String[] args)
	{
		int n,r,sum=0,temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
			n = sc.nextInt();
		temp = n;
		while(n>0) {
			r = n%10;
			sum = sum+r*r*r;
			n = n/10;
		}
			if(sum==temp) {
				System.out.println("Its an Armstrong Number");
			}
			else {
				System.out.println("Not an Armstrong Number");
				}

	}

}
