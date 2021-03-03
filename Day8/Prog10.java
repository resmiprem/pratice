package Day8;

public class Prog10 {

	public static void main(String[] args) {
		C cc=new C(9);
		
		
	}

}
class A
{
	public A(int a)
	{
		System.out.println("Class A var a is "+a);
	}
}
class B
{
	public B(int b)
	{
		System.out.println("Class B var b is "+b);
	}
}
class C extends A
{
	B b=new B(7);
	public C(int c)
	{
		super(5);
		System.out.println("Class C var c is "+c);
		
	}

}