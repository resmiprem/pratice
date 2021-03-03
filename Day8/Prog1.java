package Day8;

public class Prog1 {
int var=2;
	public static void main(String[] args) {
		int c=10;
		float f=1.6f;
		double d=4.98;
		String s="hello";
		char ch='r';
		int a[]= {1,2};
		Prog1 p=new Prog1();
		passingClass pc=new passingClass();
		System.out.println("before passing arguement");
		
		System.out.println("int="+c);
		System.out.println("float="+f);
		System.out.println("double="+d);
		System.out.println("string="+s);
		System.out.println("character="+ch);
		System.out.println("array="+a[1]);
		System.out.println("var="+p.var);
		pc.demo(c,f,d,s,ch,a,p);
		System.out.println("after passing arguement");
		
		System.out.println("int="+c);
		System.out.println("float="+f);
		System.out.println("double="+d);
		System.out.println("string="+s);
		System.out.println("character="+ch);
		System.out.println("array="+a[1]);
		System.out.println("var="+p.var);
		

	}

}
class passingClass{
	public void demo(int c,float f,double d,String s,char ch,int arr[],Prog1 p)
	{
		 c=c+2; f=f+0.2f;d=d+4.67; s="welcome"; ch='c'; arr[1]=3; p.var=7;
		
	}
}