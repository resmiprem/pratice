package Day11;

public class Prog4_UserDefinedException {

	public static void main(String[] args) {
		try {
		System.out.println("Start of Try Block");
			throw new MyException();
		}
		catch(MyException e)
		{
			System.out.println("Catch Block");
		System.out.println(e);	
		}
	}

}
class MyException extends Exception
{
	public String toString()
	{
		return("This is my own exception");
	}
}