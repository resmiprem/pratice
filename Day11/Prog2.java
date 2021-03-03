package Day11;

public class Prog2 {

	public void mth1()
	{
		mth2();
		System.out.println("caller");
	}
	public void mth2()
	{
		try
		{int i=1/0;
			//return;
			System.exit(0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch-myth2");
		}
		finally
		{
		System.out.println("finally-myth2");	
		}
	}
public static void main(String[] args)
{
	Prog2 p=new Prog2();
	p.mth1();
}
}
