package programs;
import java.util.Scanner;
public class Leapyear
{

	public static void main(String[] args)
	{
		int Year,a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year : ");
		Year = sc.nextInt();
			if(Year%100==0)
			{
				if(Year%400!=0)
					{
					System.out.println(Year + " is a not leap year." );
					}
				else
				{
					System.out.println(Year + " is a leap year." );
				}
			}
			else if(Year%4==0)
			{
				System.out.println(Year + " is a leap year." );
			}
			else
			{
				System.out.println(Year + " is not a leap year.");
			}
	}

}
