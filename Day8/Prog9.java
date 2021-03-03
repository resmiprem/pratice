package Day8;

public class Prog9 extends child {

	public static void main(String[] args) {
		Prog9 p=new Prog9();
//System.out.println("child public var:"+p.a);
System.out.println("child protected var:"+p.b);
System.out.println("child private var:"+p.c);
//p.met1();
p.met2();
p.met3();
	}

}
class child{
	private int a=10;
	public int b=20;
	protected int c=30;
	private void met1()
	{
	System.out.println("private method");
	}
	public void met2()
	{
	System.out.println("public method");
	}
	protected void met3()
	{
	System.out.println("protected method");
	}
}