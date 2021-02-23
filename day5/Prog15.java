package Day5;
import java.io.*;
import java.applet.*;
public class Prog15 {
public static void main(String[] args) {
	Prog15 m=new Prog15();   
	
	System.out.println(m.amethod());  } 
public int amethod() {
	try {            
		FileInputStream dis=new FileInputStream("Hello.txt");}
	catch (FileNotFoundException fne) {                     
		System.out.println("No such file found");         
		return -1;                          }
	catch(IOException ioe) {                          } 
	finally{         
		System.out.println("Doing finally");          }      
	return 0;  
}
//Prog17 b=new Prog17();              
//Sub s=(Sub) b;//we get runtime exception
}
//output will be No such file found, Doing finally, -1

class Prog16
{
	public void demo1()
	{
	/*	Which of the following statements are true?
				1) Methods cannot be overriden to be more private 
2) Static methods cannot be overloaded
3) Private methods cannot be overloaded
4) An overloaded method cannot throw exceptions not checked in the base class*/
		//Statement one is true.
	}
}



