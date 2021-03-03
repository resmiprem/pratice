package Day11;

public class Prog6 {

	public static void main(String[] args)throws ArithmeticException {
		derived d=new derived();

	}

}
class parent{
	public parent()throws ArithmeticException
	{
//	int a=3/0;
		throw new ArithmeticException();
	}
	
	
}
class derived extends parent
{
	public derived()throws ArithmeticException
	{
		try
		{
	 new parent();
	}
		catch(ArithmeticException e)
		{
			System.out.println("exception in base");
		}
	}
}