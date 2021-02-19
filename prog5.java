package ey;
import java.util.Scanner;
public class prog5 {
	
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many num-");
		n=s.nextInt();
		int x=0,j=1;
		while (j<=n)
		{
			x+=s.nextInt();
			j++;
		}
	
		int i=avg(n,x);
		System.out.println("average="+i);
		

	}
	static int avg(int no,int num)
	{
		return num/no;
	}

}
