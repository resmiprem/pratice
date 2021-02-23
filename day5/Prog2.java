
public class Prog2 {

	
		 public static void main(String arguments[]) {                 
			// amethod(arguments);  error Can't make static reference to void amethod.
			 Prog2 p=new Prog2();
			 p.amethod(arguments);}         
		 public void amethod(String[] arguments) {                  
			 System.out.println(arguments);                 
		 System.out.println(arguments[1]);  
		 }

	}


