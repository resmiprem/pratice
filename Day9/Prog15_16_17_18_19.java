package Day9;

public class Prog15_16_17_18_19 {

	public static void main(String[] args) {
		System.out.println("Arithmentic  Operators");
		int a=5,b=6,c=7,d=8,e=9,f;
		f=(a*b)+(b-c)/d;
		System.out.println("f=(a*b)+(b-c)/d="+f);
		System.out.println("Assignment  Operators");
		a+=b;
		c-=b;
		e*=f;
		System.out.println("a+=b:"+a+"c-=b:"+c+"e*=f:"+e);
		System.out.println("Comparision Operators");
		if(a<=b)
		{
			a=b;
			System.out.println("if a is less than b then assign a equal to b" );
		}
		if(e>=f)
		{
			e+=f;
			System.out.println("if e is greater than f then assign a equal to b" );
		}
		Prog16 p=new Prog16();
		p.division();
	
	}

}
class Prog16
{
	public void division()
	{
		int a=22%10;
		double b=22.25%10;
		System.out.println("Remainder 22/10 and 22.25%10 is "+a+b);
	}
}
class Prog18
{
	public void demo()
	{
		 int a = 1;   
		 int b = 2;    
		 int c;     
		 int d;    
		 c = ++b;   
		 d = a++;   
		 c++;
		 System.out.println(" the value of c and d after executing this code is"+c+" "+d);
	}
}
