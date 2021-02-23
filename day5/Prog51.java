package Day5;

public class Prog51 extends Prog59 {
private int i;
	public static void main(String[] args) {
		   Prog51 s = new Prog51();          
		   s.amethod();
		   int iBase=0;         s.amethod2(iBase);         }      
	public void amethod2(int iOver){     
			   System.out.println("Over.amethod");         } 
	public static void amethod(){          
	//	System.out.println(i);         	cannot make static reference to non static field
	}

}


class Prog59{
	private void amethod(int iBase){    
		System.out.println("Base.amethod");         } }