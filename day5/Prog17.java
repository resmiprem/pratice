package Day5;
import java.applet.*;
import java.awt.*;
public class Prog17 {

	public static void main(String[] args) {
		Prog21 p=new Prog21();
		p.demo();

	}

}
//<applet name=MgAp code=MgAp.class height=400 width=400 parameter HowOld=30 >  </applet>  ; 
 //class MgAp extends Applet{     
	//public void init(){        
	//	System.out.println(getParameter("age"));                  }  } 
class Prog21
{
	public void demo()
	{
		int i;      int j;     
		outer:      for (i=1;i <3;i++)    
			inner:           for(j=1; j<3; j++) {             
				if (j==2)                   
					continue outer;         
		System.out.println("Value for i=" + i + " Value for j=" +j);                      } 
	}
}//output will be-alue for i=1 Value for j=1
//Value for i=2 Value for j=1