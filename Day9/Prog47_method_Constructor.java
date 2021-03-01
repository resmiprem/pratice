package Day9;

public class Prog47_method_Constructor {

	public static void main(String[] args) {
		add a2=new add(10,20);
		add a3=new add(10,20,30);
		add a4=new add(10,20,30,40);
		
	}

}
class add
{
	add(int n1,int n2)
	{
		System.out.println("Sum of two numbers: "+(n1+n2));
	}
	add(int n1,int n2,int n3)
	{
		System.out.println("Sum of two numbers: "+(n1+n2+n3));	
	}
	add(int n1,int n2,int n3,int n4)
	{
		System.out.println("Sum of two numbers: "+(n1+n2+n3+n4));	
	}
}