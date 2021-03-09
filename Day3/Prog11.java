package ey;

import java.util.Scanner;

public class Prog11 {

	public static void main(String[] args) {
		int a[]=new int[6];
		int n=0;
	Scanner c=new Scanner(System.in);
	for(int i=0;i<6;i++)
	{
		
			a[i]=c.nextInt();
			}
				
	
	for(int i=1;i<=(6/2);i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(a[n]+"  ");
			n++;
		}
		System.out.println("\n");}
}
}