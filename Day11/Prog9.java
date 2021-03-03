package Day11;
import java.util.Scanner;
public class Prog9 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int num;
try {
	System.out.println("Enter a number");
	num=s.nextInt();
	if(num>100)
	{
		throw new OutOfRangeException();
	}
	if(num<0)
	{
		throw new NegativeValueException();
	}
}
catch(OutOfRangeException e)
{
	System.out.println(e);
}
catch(NegativeValueException ne)
{
	System.out.println(ne);
}
	}

}
class OutOfRangeException extends Exception
{
	public String toString()
	{
		return "Enter a number between 0 and 100";
	}
}
class NegativeValueException extends Exception
{
	public String toString()
	{
		return "Enter a number grater than 0";
	}
}