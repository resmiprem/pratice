package Day5;

public class Prog36 extends Prog40 {

	public static void main(String[] args) {
		Prog36 p=new Prog36();
		
	}
	Prog36()
	{super(10);
		String s="Java"; 
		String s2="java";      
		if(s.equalsIgnoreCase(s2)) 
				{         System.out.println("Equal");   
		}
		else        
		{       
			System.out.println("Not equal");          }  
		}
	public void devired() {
		
	}
	}


class Prog38{
/*	How can you change the current working directory using an instance of the File class called FileName? 
			1) FileName.chdir("DirName")
2) FileName.cd("DirName") 
3) FileName.cwd("DirName") 
4) The File class does not support directly changing the current directory. */
	//////
//	4 (File class does not support directly changing the current directory.) is the correct answer
}

class Prog40
{
	      
		Prog40(int i){    
			System.out.println("base constructor");         }    
		Prog40(){         } }
