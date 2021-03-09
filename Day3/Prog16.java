package ey;
import java.util.Scanner;
public class Prog16 {

	public static void main(String[] args) {
		int a[]=new int[6];
		int c=0;
		Scanner s=new Scanner(System.in);
		int x;
x=s.nextInt();
for(int j=0;j<4;j++)
{
	a[j]=s.nextInt();}
for(int j=0;j<4;j++)
{
	if(a[j]==x)
	{
		System.out.println("found at the location:"+(j+1));
		c++;
	}
}
System.out.println("it occurs "+c+" times");	}

}
