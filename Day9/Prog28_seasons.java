package Day9;

import java.util.Scanner;

public class Prog28_seasons {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String season;
		System.out.println("Enter the month");
		season=s.next();
if(season.equals("march") || season.equals("april") )	{
System.out.println("Spring season");	}

if(season.equals("may") || season.equals("june") )	{
	System.out.println("Summer season");
}
if(season.equals("july") || season.equals("august") )	{
	System.out.println("Rainy season");
}
if(season.equals("september") || season.equals("october") )	{
	System.out.println("Autumn season");
}
if(season.equals("november") || season.equals("december") )	{
	System.out.println("Pre-Winter season");
}
if(season.equals("january") || season.equals("febuary") )	{
	System.out.println("Winter season");
}
}
}