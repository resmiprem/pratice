package Day9;

public class Prog21_22_23 {

	public static void main(String[] args) {
		boolean a,b,c,d,e,f,g;
		 a = true; b = false  ;  
				 c = a | b;   
		 d = a & b;  
		 e = a ^ b;     
		 f = (! a & b) | (a &! b);    
		 g =! a;
System.out.println("the value of c, d, e, f, and g are "+c+" "+d+" "+e+" "+f+" "+g);
	}

}
class Prog22{
	public void demo()
	{
		int a=20;int b=10;
		int x = a>b? a:b; 
		System.out.println("the value of x is "+x);
	}
}
class Prog23{
	public void demo2()
	{
		int rad=10,h=5,acceleration=3,velocity=7,mass=5;
		double pi=3.14,energy,area;
		area = ((pi*rad*rad) + (2*pi*rad*h) );
				energy = mass* (acceleration*h +(velocity*velocity)/2);
				System.out.println("");
	}
}