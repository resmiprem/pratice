package Day5;
class Base{        public void amethod(int i) {  } } 
public class Prog23 extends Base{
	public static void main(String argv[]){     Prog24 p=new Prog24();
	p.demo();  
	Prog25 r=new Prog25();
	r.demo2(); 
	Prog26 q=new Prog26();
	q.demo3();
	Prog27 s=new Prog27();
	s.demo4();
	Prog28 t=new Prog28();
	t.demo5();
	Prog29 u=new Prog29();
	u.demo6();} 
	
	//void amethod(long i)throws Exception {} 
	//void amethod(long i){}  
	
}
class Prog24
{
	public void demo()
	{
		System.out.println(Math.floor(-4.3));
		System.out.println(Math.round(-4.3));  
		System.out.println(Math.ceil(-4.3));//Math.ceil will print -4.0
       
	}
}

class Prog25
{
	public void demo2()
	{
		Integer ten=new Integer(10); 
		Long nine=new Long (9); 
		System.out.println(ten + nine); 
		int i=1; System.out.println(i + ten); 
	}
}//output will be =19 followed by 11


class Prog26
{
	public void demo3()
	{
		String s=new String("Bicycle");  
		int iBegin=1; 
		char iEnd=3; 
		System.out.println(s.substring(iBegin,iEnd));//output will be "ic"
	}
}

class Prog27
{
	public void demo4()
	{
		String s="java";
		System.out.println(s.indexOf('v'));
	}
}

class Prog28
{
	public void demo5()
	{
		String s1=new String("Hello") ;
			String s2=new String("there"); 
		String s3=new String(); 
		 s3=s1 + s2; //only this statement is possible.
		 System.out.println(s3);
		  //s3=s1-s2;  
		 //s3=s1 & s2;  
		//s3=s1 && s2 
	}
}


class Prog29
{
	public void demo6()
	{System.out.println(4 | 3);}}//output =7