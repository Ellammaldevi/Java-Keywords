package Keywords;

import java.util.Scanner;

public class ControlKeywords
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = in.nextInt();
	
		if (age<=18)
		{
			System.out.println("Your age is between 1-18");
		}
		else if ((age>=18) && (age<=35))
		{
			System.out.println("Your age is between 18-35");
		}
		else if ((age>=35) && (age<=50))
		{
			System.out.println("Your age is between 35-50");
		}
		else
		{
			System.out.println("Your age is above 50");
		}
	}

}
