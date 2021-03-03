package Day8;

public class Prog5_noOfObjects {
	static int Objects = 0; 
	  
	    
	    { 
	        Objects += 1; 
	    } 
	  
	    
	    public Prog5_noOfObjects() 
	    { 
	    } 
	    public Prog5_noOfObjects(int n) 
	    { 
	    } 
	    public Prog5_noOfObjects(String s) 
	    { 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	    	Prog5_noOfObjects t1 = new Prog5_noOfObjects(); 
	    	Prog5_noOfObjects t2 = new Prog5_noOfObjects(5); 
	    	Prog5_noOfObjects t3 = new Prog5_noOfObjects("GFG"); 
	  
	       
	        System.out.println("No of objects created="+Objects); 
	    } 
	} 

