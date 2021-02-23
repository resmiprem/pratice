package Day5;

public class Prog41  {
	static int j=20;
	public static void main(String[] args) {
		int i=10;     
		Prog41 p = new Prog41();       
		p.amethod(i);    
		System.out.println(i);    
		System.out.println(j); 
		Prog42 r=new Prog42();
		r.demo();
		Prog44 q=new Prog44();
		q.demo2();
		Prog45 m=new Prog45();
		m.amethod(m);
		Prog49 n=new Prog49();
		n.demo2();}        
	public void amethod(int x){     
		x=x*2;      
		j=j*2;         } 
	

	}//output:10 40


class Prog42
{
	public void demo()
	{
		        int ia[] = new int[4];   
		        for (int i=0; i< ia.length; i++)      {         
		    	   ia[i]=i;        
		    	   System.out.println(ia[i]);            }	
	}
}

/*private class Prog43{ //a class cannot be private 
	Prog43(){   
	int i = 100;      
	System.out.println(i);      } }*/


class Prog44
{
	public void demo2()
	{
		int oi= 012;      
		System.out.println(oi);
	}
}//output:10

class Prog45
{
	  public void amethod(Prog45 p){      
		  int i=99;         
		  multi(p);         
		  System.out.println(i);           }   
	  public void multi(Prog45 p){           
		//  p.i = p.i*2;      compile time error
		  } 
}
  

class Prog49
{
	public void demo2()
	{
		int iRand;      
	//Compile time error referring to a cast problem iRand = Math.random();     
	//	System.out.println(iRand); 
	}
}