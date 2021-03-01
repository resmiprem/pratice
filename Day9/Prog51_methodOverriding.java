package Day9;

public class Prog51_methodOverriding {

	public static void main(String[] args) {
		child c=new child();
		c.demo();
	}

}
class parent
{int no=10;
	public void demo()
	{
		System.out.println("the value of parent class no:"+no);
	}
}
class child extends parent
{int no=20;
	public void demo()
	{
		super.demo();
		System.out.println("the value of child class no:"+this.no);
		System.out.println("the value of parent class no:"+super.no);
	}
}