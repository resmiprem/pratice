package ey;

public class Prog17b {

	public static void main(String[] args) {
		staticmembers s=new staticmembers();
		s.nonstatic();
	}

}
class staticmembers{
	
	static int n=5;
	public void nonstatic()
	{
		System.out.println(n);
	}
	
}
