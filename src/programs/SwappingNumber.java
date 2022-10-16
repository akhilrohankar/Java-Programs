package programs;
import java.util.Scanner;
class SwappingNumber
{

	public static void main(String[] args)
	{
		int a,b,temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x = ");
		a = sc.nextInt();
		System.out.print("Enter y = ");
		b = sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("  After Swapping the Numbers");
		System.out.println("  x = "+a);
		System.out.println("  y = "+b);
	}

}
