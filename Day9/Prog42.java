package Day9;

import java.util.Scanner;

public class Prog42 {

	public static void main(String[] args) {
int c=1,n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(c+" ");
		c++;
	}
	System.out.println("\n");
}

	}

}
