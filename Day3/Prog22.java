package ey;

public class Prog22 {
public static void main(String[] args) {
	demo d=new demo();
	d.met1();
	d.met2();
	d.met3();
}
	
}

class demo
{
	public int i;
	private int j;
	protected int k;
	int l;
	public void met1()
	{
		System.out.println("pub"+i);
	}
	protected void met2()
	{
		System.out.println("pri"+j);	
	}
	private void met3()
	{
		System.out.println("pro"+k);
	}
	
}