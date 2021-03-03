package Day8;

public class Prog13 extends ab{

	public static void main(String[] args) {
		
//ab a=new ab();
		//instance cannot be created for abstract class
	}

}
abstract class ab
{
	public void demo()
	{
		System.out.println("Non abstract method inside abstract class");
	}
}