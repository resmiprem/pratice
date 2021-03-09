package ey;

public class Prog27 {

	public static void main(String[] args) {
		int p = 14000;
		float firstyr = (float)(p+(p*0.40));
		System.out.println("first year:"+firstyr);
		float secondyr = firstyr-1500;
		System.out.println("second year:"+secondyr);
		float thirdyr = (float)(secondyr+(secondyr*0.12));
		System.out.println("third year: "+thirdyr);

	}

}
