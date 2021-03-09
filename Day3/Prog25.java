package ey;

public class Prog25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

protected class Base{ // illegal modifier error because of the use of protected
	String method() {
		return "wow";
	}
}

class Derived{  
	public void useD() {
		Base zBase=new Base();
		System.out.println("base says "+zBase.method());
		
	}
}