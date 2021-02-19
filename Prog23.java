package ey;

public class Prog23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
prodemo d=new prodemo();
System.out.println("before manipulation i="+d.i);
d.i+=10;
System.out.println("after manipulation i="+d.i);
	}

}
class prodemo{
	 int i=10;
	
}