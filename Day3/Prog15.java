package ey;

import java.util.Scanner;

public class Prog15 {

	public static void main(String[] args) {
		int n,flag=0;
		
		for(int j=2;j<=100;j++)
		{
		for(int i=2;i<=j/2;i++)
		{
			if(j%i==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag ==0)
		{
		System.out.println(j+" is a prime number");	
		}
		flag=0;
		}

	}

}
