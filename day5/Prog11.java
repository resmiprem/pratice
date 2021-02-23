package Day5;
abstract class MineBase {         
	abstract void amethod();        
	static int i;  }
public class Prog11 extends MineBase {
public static void main(String[] args) {
		   int[] ar=new int[5];                       
		   for(i=0;i < ar.length;i++)                             
			   System.out.println(ar[i]);//5 0's will be printed.
		   Prog12 p=new Prog12();
		   p.demo();
		  Prog13 r=new Prog13();
		  r.demo2();
		   
		  Prog14 q=new Prog14();
		  q.demo3();
	}

@Override
void amethod() {
	// TODO Auto-generated method stub
	
}

}
 class Prog12
 {
	     public void demo()
	     {
	    	 int i=1;   
	    	 switch (i) {                
	    	 case 0:                
	    		 System.out.println("zero");          
	    		 break;    
	    		 case 1:          
	    			 System.out.println("one");     
	    			 case 2:              
	    				 System.out.println("two");      
	    	 default:           
	    		 System.out.println("default"); }
	     }
 }// output will be-one two default,since break statements are not given.
 
 class Prog13
 {
	 public void demo2()
	 {
		 int i=9; switch (i) {     
		 default:      
			 System.out.println("default");      
			 case 0:       
				 
				 System.out.println("zero");               
				 
				 break;      
				 case 1:          
			 System.out.println("one");       
			 case 2:    
				 System.out.println("two");  
		 }
	 }
 }//output will be default zero.
 
 
 class Prog14
 {public void demo3() {
 // 1) int i=0;  if(i) {  System.out.println("Hello");   if conditions are boolean hence it shows error.       }
  boolean b=true;  boolean b2=true;  if(b==b2) {          System.out.println("So true");          }
   int i=1;  int j=2;  if(i==1|| j==2)          System.out.println("OK"); 
// 4)  int i=1;  int j=2;  if(i==1 &| j==2)          System.out.println("OK");
 }
 }