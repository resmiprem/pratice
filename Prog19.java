package ey;

import java.util.Scanner;

public class Prog19 {
	
	int a[][]=new int[4][4];
public static void main(String[] args) {
	int a[][]=new int[4][4];
	Scanner c=new Scanner(System.in);
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			a[i][j]=c.nextInt();
			}
				}
	revarray(a,4,4);
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			System.out.print(a[i][j]+" ");
			}
		System.out.print("\n");	}
	
}
static void revarray(int a[][],int row,int col)
{
	int end=col-1,temp;
	for(int i=0;i<row;i++) {
		for(int j=0;j<end;j++) {
	temp=a[i][j];
	a[i][j]=a[i][end];
	a[i][end]=temp;
	
	end--;
	}
	}
}
}
