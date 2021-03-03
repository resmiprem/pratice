package Day11;
import java.util.Scanner;
public class Prog7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String numerator;
		String denominator;
		int res;
		boolean t=true;
	
		
	while(t)
		{System.out.println("Enter numerator and denominator");
			numerator=s.next();
			denominator=s.next();
			try
			{
				res=Integer.parseInt(numerator)/Integer.parseInt(denominator);
				System.out.println("result="+res);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("division by zero or poor input data");			}
			catch(Exception e)
			{
				if(numerator.charAt(0)=='q' ||numerator.charAt(0)=='Q')
				{
					t=false;
					System.out.println("loop terminates");
				}
				
			}
		}

	}

}
