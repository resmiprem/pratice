package ey;
import java.util.Scanner;
public class Prog10 {

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
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]+"  ");
				}
			System.out.println("\n");
		}
	}

}
