package Day5;

public class Prog8 {
	static int i; 
	public static void main(String[] args) {
		System.out.println(i);//output will be 0. because static variables are by default initialized as 0.
		Prog9 p=new Prog9();
		p.demo1();
		Prog10 r=new Prog10();
		r.demo2();
	}

}
class Prog9
{
	public void demo1()
	{
		int anar[]=new int[]{1,2,3};              
		System.out.println(anar[1]); //1 refers to second index in an array hence 2 will be the output.
	}
}

class Prog10
{
	public void demo2()
	{
		   int anar[]=new int[5];           
		   System.out.println(anar[0]);  //output is 0.By default array values are declared as 0. 
	}
}