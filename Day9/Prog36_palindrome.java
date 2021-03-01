package Day9;
import java.util.Scanner;
public class Prog36_palindrome {

	public static void main(String[] args) {
		int Number, Temp, Reminder, Reverse = 0;
	Scanner	sc = new Scanner(System.in);
		
		System.out.println("Please Enter any number to Check for Palindrome: ");
		Number = sc.nextInt();
		Temp = Number;
		while(Temp > 0) {
			Reminder = Temp %10;
			Reverse = Reverse * 10 + Reminder;
			Temp = Temp /10;
		}
		System.out.format("Reverse of entered number is = %d\n", Reverse);
		if(Number == Reverse) {
			System.out.format("%d is Palindrome Number.", Number);
		}
		else  {
			System.out.format("%d is Not a Palindrome Number.", Number);
		}
		stringPalindrome sp=new stringPalindrome();
		sp.meth();
		
	}

}
class stringPalindrome
{
	public void meth()
	{
		 String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	}
}
