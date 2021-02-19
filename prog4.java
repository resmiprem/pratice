package ey;
import java.util.Scanner;
public class prog4 {
	public static void main(String[] args) {
		int n,flag=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(n==1)
		{
			System.out.println("n is neither prime nor composite");
		}
		else if(flag ==1)
		{
		System.out.println("n is not a prime number");	
		}
		else
		{
			System.out.println("n is a prime number");
		}
	}

}
