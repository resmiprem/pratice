package Day5;
import java.lang.Runnable;
public class Prog30 {

	public static void main(String[] args) {
		
		Prog33 p=new Prog33();
		Thread t1=new Thread(p);
		t1.start();
		Prog35 r=new Prog35();
		String s=new String("ello");
		r.amethod(s);}
	
	 class MyInner {} 

}


class Prog33 implements Runnable{  
	
	int i=0;   
//public int run(){     //it will cause an error because the return type of run method is void
	public void run(){	
	while(true){              
		i++;          
	System.out.println("i="+i);        
	} 
     }
}

class Prog35
{
	
	public void amethod(String s){   
		char c='H';   
	//	c+=s;      += cannot be used for char,string type
		System.out.println(c);      } 
	
}