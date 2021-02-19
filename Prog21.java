package ey;

import java.util.Scanner;

public class Prog21 {

	public static void main(String[] args) {
		int month;
		int days,year;
		Scanner c=new Scanner(System.in);
		month=c.nextInt();
		year=c.nextInt();
		switch(month)
		{
			case  4:
			case  6:
			case  9:
			case 11:
				days=30;
				System.out.println("Number of days in " +month+" month is: "+days);
				break;
			case  1:
			case  3:
			case  5:
			case  7:
			case  8:
			case 10:
			case 12:
				days=31;
				System.out.println("Number of days in " +month+" month is: "+days);
				break;
				
			case 2:
				days=28;
				System.out.println("Number of days in " +month+" month is: "+days);
				if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
			         System.out.println(year+" year is a leap year");
			      else
			         System.out.println(year+" year is not a leap year");
				break;
			
			default:
				days=0;
				System.out.println("You have entered an invalid month!!!\n");
				break;		
		}
	}

}
